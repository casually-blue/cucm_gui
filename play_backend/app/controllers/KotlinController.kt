package controllers

import play.libs.Json
import play.mvc.*
import javax.inject.Inject
import javax.xml.ws.BindingProvider

import org.coramdeoacademy.cucm.*

class KotlinController @Inject constructor(service: AXLAPIService): Controller() {
    val client: AXLPort = service.axlPort

    init {
        (client as BindingProvider).requestContext.let {
            it[BindingProvider.USERNAME_PROPERTY] = "cdaadmin"
            it[BindingProvider.PASSWORD_PROPERTY] = "cdaadmpw"
        }
    }

    fun index(): Result? = ok("Hello from kotlin")

    fun getPhones(): Result? = ListPhoneReq().let { req ->
        ListPhoneReq.SearchCriteria().let { sc ->
            sc.name = "%"
            sc
        }.also { req.searchCriteria = it }
        client.listPhone(req)
            .`return`
            .phone
            .let {
                ok(Json.newObject().putPOJO("phones", Json.toJson(it)))
            }
    }

}