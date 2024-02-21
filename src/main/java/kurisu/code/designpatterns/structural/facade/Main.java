package kurisu.code.designpatterns.structural.facade;

/**
 * Facade Design Pattern
 * 
 * Basically it's an interface, not literally (java interface) but as the idea to
 * move the coupling/depending code to a single other class to 
 * avoid hard coupling.
 */
public class Main {

    public static void main(String[] args) {

        // -> Moving all these code into a facade for decoupling
        // Original code here: 

        // NotificationServer server = new NotificationServer();
        // Connection connection = server.connect("123.123.123.123");
        // AuthToken token = server.authenticate("myCoolApp", "verySecretKey");
        // Message message = new Message("Hello, World!");
        // server.send(token, message, "destination?");
        // connection.disconnect();

        // Result after applying facade ->

        NotificationService service = new NotificationService();
        service.send("Hello, World!", "destination?");
    }
    
}
