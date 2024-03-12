package kurisu.code.designpatterns.behavioral.chainOfResponsibility;

/**
 * Chain of Responsibility 
 * 
 * Allows you to define a detached stand-alone chain of handlers
 * in a particular order to process a request.
 * 
 * Each handler can redirect you to the next handler or end the request flow.
 * 
 *      Request -> Handler1 -> Handler2 -> Handler3 -> Solved!
 *                    \           \           \
 *                  Denied      Denied      Denied
 */
public class Main {
    public static void main(String[] args) {
        /*
         * The final chain will be:
         * 
         * authenticator -> logger -> compressor
         * 
         * Assemble the chain in reverse:
         */
        Compressor compressor = new Compressor(null); // null means is the last
        Logger logger = new Logger(compressor); // Middle
        Authenticator authenticator = new Authenticator(logger); // First

        WebServer server = new WebServer(authenticator); // Setup first handler only

        server.handle(new HttpRequest("admin", "12345"));
    }
}
