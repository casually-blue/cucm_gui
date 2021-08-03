package controllers;

import play.mvc.*;
import play.libs.Json;

import org.jetbrains.annotations.*;

import javax.inject.*;
import javax.xml.ws.*;

import java.util.concurrent.*;

import org.coramdeoacademy.cucm.*;

/**
 * This Controller handles JSON Creation from the CUCM API
 */
public class CUCMListPhonesController extends Controller {
    private final AXLPort axlClient;

    @Inject
    public CUCMListPhonesController(@NotNull AXLAPIService apiService){
        this.axlClient = apiService.aXLPort();

        putContextProperty(BindingProvider.USERNAME_PROPERTY, "cdaadmin");
        putContextProperty(BindingProvider.PASSWORD_PROPERTY, "cdaadmpw");
    }

    private void putContextProperty(String property, Object value){
        ((BindingProvider) axlClient).getRequestContext().put(property, value);
    }

    public Result getPhones() {
        try {
            return jsonResponse("phones", getResponse(axlClient.listPhone(getListPhoneReq())).getReturn().getPhone());
        } catch (Exception e) {
            return ok(views.html.exception.render(e));
        }
    }

    private @NotNull
    ListPhoneReq getListPhoneReq() {
        ListPhoneReq req = new ListPhoneReq();
        ListPhoneReq.SearchCriteria criteria = new ListPhoneReq.SearchCriteria();
        {
            criteria.setName("%");
        }
        req.setSearchCriteria(criteria);
        return req;
    }

    public <R> R getResponse(@NotNull CompletionStage<R> res) throws ExecutionException, InterruptedException {
        return res.toCompletableFuture().get();
    }

    public Result jsonResponse(String name, Object o){
        return ok(
                Json.newObject().putPOJO(name, Json.toJson(o))
        );
    }
}
