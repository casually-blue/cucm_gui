package controllers

import org.coramdeoacademy.cucm.*
import play.libs.Json
import play.mvc.Controller
import play.mvc.Result
import javax.inject.Inject
import javax.xml.ws.BindingProvider

class KotlinController @Inject constructor(service: AXLAPIService): Controller() {
    val client: AXLPort = service.axlPort

    init {
        (client as BindingProvider).requestContext[BindingProvider.USERNAME_PROPERTY] = "cdaadmin"
        (client as BindingProvider).requestContext[BindingProvider.PASSWORD_PROPERTY] = "cdaadmpw"
    }

    fun index(): Result? {
        return ok("Hello From Kotlin")
    }

    fun getPhones(): Result? {
        ListPhoneReq().let { req ->
            req.searchCriteria = ListPhoneReq.SearchCriteria().let { sc ->
                sc.name = "%"
                sc
            }
            client.listPhone(req).`return`.phone.let {
                return ok(Json.newObject().putPOJO("phones", Json.toJson(it)))
            }
        }
    }
}