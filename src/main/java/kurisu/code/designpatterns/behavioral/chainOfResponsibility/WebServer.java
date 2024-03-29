package kurisu.code.designpatterns.behavioral.chainOfResponsibility;

public class WebServer {
    private Handler handler;
    
    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request){
        // Auth
        // Logging
        // Compression
        handler.handle(request);
    }
    
}
