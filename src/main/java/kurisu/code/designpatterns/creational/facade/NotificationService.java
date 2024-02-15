package kurisu.code.designpatterns.creational.facade;

public class NotificationService {

    public void send(String message, String target) {
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("123.123.123.123");
        AuthToken token = server.authenticate("myCoolApp", "verySecretKey");
        server.send(token, new Message(message), target);
        connection.disconnect();
    }

}
