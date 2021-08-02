package handlers;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class AuthHandler implements SOAPHandler<SOAPMessageContext> {
    private final String token;

    public AuthHandler (String username, String password){
            token = Base64.getEncoder().encodeToString((username + ":" + password).getBytes(StandardCharsets.UTF_8));
    }

    public Set<QName> getHeaders() {
        return null;
    }

    public boolean handleMessage(SOAPMessageContext context) {
        if ((boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)) {
            // Get headers, create if null
            Map<String, List<String>> headers = (Map) context.get(MessageContext.HTTP_REQUEST_HEADERS);
            if (headers == null) {
                headers = new HashMap<>();
            }

            // Add authentication header
            System.out.println("Authenticating: " + token);
            headers.put("Authentication-Token", Arrays.asList(token));
            context.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
        }
        return true;
    }

    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    public void close(MessageContext context) {
    }

}
