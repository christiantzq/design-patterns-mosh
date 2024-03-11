package kurisu.code.designpatterns.behavioral.chainOfResponsability;

import lombok.Getter;
import lombok.Setter;

public class HttpRequest {
    @Setter @Getter private String username;
    @Setter @Getter private String password;
    
    public HttpRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }



    
}
