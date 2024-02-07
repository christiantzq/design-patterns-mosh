package kurisu.code.designpatterns.behavioural.chainOfResponsability;

/**
 * Chain of Responsability 
 * 
 * This design pattern lets you define a detached (losely coupled)
 * chain of handlers that are defined outside of any component
 * 
 */
public class Main {
    public static void main(String[] args) {
        // authenticator -> logger -> compressor

        Compressor compressor = new Compressor(null); // null means is the last
        Logger logger = new Logger(compressor);
        // Add Encription here??? easy change using this design pattern!!!
        Authenticator authenticator = new Authenticator(logger);

        WebServer server = new WebServer(authenticator);

        server.handle(new HttpRequest("admin", "12345"));
    }
}
