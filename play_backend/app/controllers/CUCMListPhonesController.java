package controllers;

import play.mvc.*;
import play.libs.Json;

import javax.inject.*;
import javax.xml.ws.*;

import org.coramdeoacademy.cucm.*;

/**
 * This Controller handles JSON Creation from the CUCM API
 */
public class CUCMListPhonesController extends Controller {
    private final AXLPort axlClient;

    @Inject
    public CUCMListPhonesController(AXLAPIService apiService){
        this.axlClient = apiService.getAXLPort();

        putContextProperty(BindingProvider.USERNAME_PROPERTY, "cdaadmin");
        putContextProperty(BindingProvider.PASSWORD_PROPERTY, "cdaadmpw");
    }

    private void putContextProperty(String property, Object value){
        ((BindingProvider) axlClient).getRequestContext().put(property, value);
    }

    public Result getPhones() {
        try {
            return jsonResponse("phones", axlClient.listPhone(getListPhoneReq()).getReturn().getPhone());
        } catch (Exception e) {
            return ok(views.html.exception.render(e));
        }
    }

    ListPhoneReq getListPhoneReq() {
        ListPhoneReq req = new ListPhoneReq();
        ListPhoneReq.SearchCriteria criteria = new ListPhoneReq.SearchCriteria();
        {
            criteria.setName("%");
        }
        req.setSearchCriteria(criteria);
        return req;
    }

    public Result jsonResponse(String name, Object o){
        return ok(
                Json.newObject().putPOJO(name, Json.toJson(o))
        );
    }
}
