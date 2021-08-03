package controllers;

import play.libs.Json;
import play.mvc.*;
import org.coramdeoacademy.cucm.*;

import javax.inject.Inject;
import javax.xml.ws.BindingProvider;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;

/**
 * This Controller handles JSON Creation from the CUCM API
 */
public class CUCMListPhonesController extends Controller {
    private final AXLPort axlClient;

    @Inject
    public CUCMListPhonesController(AXLAPIService apiService){
        this.axlClient = apiService.aXLPort();

        putContextProperty(BindingProvider.USERNAME_PROPERTY, "cdaadmin");
        putContextProperty(BindingProvider.PASSWORD_PROPERTY, "cdaadmpw");
    }

    private void putContextProperty(String property, Object value){
        ((BindingProvider) axlClient).getRequestContext().put(property, value);
    }

    public Result getPhones() {
        ListPhoneReq req = new ListPhoneReq();
        ListPhoneReq.SearchCriteria criteria = new ListPhoneReq.SearchCriteria();
        {
            criteria.setName("%");
        }
        req.setSearchCriteria(criteria);

        try {
            List<LPhone> phones = getResponse(axlClient.listPhone(req)).getReturn().getPhone();
            return jsonResponse("phones", phones);
        } catch (Exception ex){
            return ok(views.html.exception.render(ex));
        }
    }

    public <Response> Response getResponse(CompletionStage<Response> res) throws ExecutionException, InterruptedException {
        return res.toCompletableFuture().get();
    }

    public Result jsonResponse(String name, Object o){
        return ok(
                Json.newObject().putPOJO(name, Json.toJson(o))
        );
    }
}
