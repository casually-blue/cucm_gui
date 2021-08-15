package controllers {
  import play.mvc._
  import io.github.casuallyblue.cucm._
  import play.mvc.Results.ok
  import play.libs.Json

  import java.util
  import javax.xml.ws.BindingProvider

  class RestController extends Controller {
    def service = new AXLAPIService
    def client: AXLPort = {
      def self = service.getAXLPort()
      def ctx = self.asInstanceOf[BindingProvider].getRequestContext

      ctx.put(BindingProvider.USERNAME_PROPERTY, "cdaadmin")
      ctx.put(BindingProvider.PASSWORD_PROPERTY, "cdaadmpw")
      ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://cdacucmpub.coramdeo.local:8443/axl/")

      self
    }

    def getPhoneList: util.List[LPhone] = {
      def req = new ListPhoneReq {
        this.setSearchCriteria(
          new ListPhoneReq.SearchCriteria {
            this.setName("%")
          })
      }

      client.listPhone(req).getReturn.getPhone
    }

    def getPhones: Result = {
      ok(Json.toJson(getPhoneList))
    }
  }
}