package kurisu.code.designpatterns.behavioral.observer;

/**
 * Concrete Subscriber
 */
public class ClientViaMobile implements Subscriber {
    private String phoneNumber;
    private PlayStation5Stock ps5Stock;

    public ClientViaMobile(String phoneNumber, PlayStation5Stock stock) {
        this.ps5Stock = stock;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update() {
        System.out.println("Message sent to mobile # "+ phoneNumber + " - PS5 stock: " + ps5Stock.getStock());
    }
    
}
