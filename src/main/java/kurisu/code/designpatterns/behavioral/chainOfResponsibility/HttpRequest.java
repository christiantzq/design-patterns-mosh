package kurisu.code.designpatterns.behavioral.chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

/**
 * Request Payload
 * 
 * This is defined in the Abstract Handler, therefore will be available to all
 * concrete Handlers.
 */
public class HttpRequest {
    @Setter @Getter private String username;
    @Setter @Getter private String password;
    
    public HttpRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
