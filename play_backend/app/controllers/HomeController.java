package controllers;

import handlers.AuthHandler;
import play.mvc.*;
import org.coramdeoacademy.cucm.*;

import javax.inject.Inject;
import java.util.concurrent.ExecutionException;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    private final AXLAPIService axlapiService;

    @Inject
    public HomeController(AXLAPIService axlapiService){
        this.axlapiService = axlapiService;
    }

    public Result getPhones() throws AXLError_Exception, ExecutionException, InterruptedException {
        System.out.println("Getting Phones");
        AXLPort client= axlapiService.getAXLPort(new AuthHandler("cdaadmin", "cdaadmpw"));
        ListPhoneRes res = client.listPhone(new ListPhoneReq() {

        }).toCompletableFuture().get();

        System.out.println("Got phones");
        return ok(views.html.index.render(res));
    }
}
