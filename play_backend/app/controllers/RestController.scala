package controllers {
  import com.google.inject.Inject
  import play.mvc._
  import io.github.casuallyblue.cucm._
  import play.mvc.Results.ok
  import play.libs.Json

  import java.util
  import javax.xml.ws.BindingProvider
  import scala.collection.JavaConverters.mapAsScalaMapConverter

  class RestController @Inject()(service: AXLAPIService) extends Controller {
    private def client: AXLPort = {
      val self = service.getAXLPort()

      val ctx = self.asInstanceOf[BindingProvider].getRequestContext.asScala
      ctx(BindingProvider.USERNAME_PROPERTY) = "cdaadmin"
      ctx(BindingProvider.PASSWORD_PROPERTY) = "cdaadmpw"
      ctx(BindingProvider.ENDPOINT_ADDRESS_PROPERTY) = "https://cdacucmpub.coramdeo.local:8443/axl/"

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
