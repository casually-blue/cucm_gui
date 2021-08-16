package utils

import com.google.inject.{Inject, Singleton}
import io.github.casuallyblue.cucm.{AXLAPIService, AXLPort}

import javax.xml.ws.BindingProvider
import scala.collection.JavaConverters.mapAsScalaMapConverter

@Singleton
class AXLClient @Inject()(service: AXLAPIService) {
  val client: AXLPort = {
    val self = service.getAXLPort()

    val ctx = self.asInstanceOf[BindingProvider].getRequestContext.asScala
    ctx(BindingProvider.USERNAME_PROPERTY) = "cdaadmin"
    ctx(BindingProvider.PASSWORD_PROPERTY) = "cdaadmpw"
    ctx(BindingProvider.ENDPOINT_ADDRESS_PROPERTY) = "https://cdacucmpub.coramdeo.local:8443/axl/"

    self
  }
}
