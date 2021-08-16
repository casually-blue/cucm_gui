package controllers {
  import com.google.inject.Inject
  import play.mvc._
  import io.github.casuallyblue.cucm._
  import play.mvc.Results.ok
  import play.libs.Json
  import utils.AXLClient

  import java.util

  class PhoneController @Inject()(client: AXLClient) extends Controller {
    def getPhones: Result = {
      def req = new ListPhoneReq {
        this.setSearchCriteria(
          new ListPhoneReq.SearchCriteria {
            this.setName("%")
          })
      }
      val resp = client.client.listPhone(req).getReturn.getPhone

      ok(Json.toJson(resp))
    }
  }
}
