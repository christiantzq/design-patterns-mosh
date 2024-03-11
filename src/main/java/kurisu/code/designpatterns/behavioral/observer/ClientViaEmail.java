package kurisu.code.designpatterns.behavioral.observer;

/**
 * Concrete Subscriber
 */
public class ClientViaEmail implements Subscriber {
    private String email;
    private PlayStation5Stock ps5Stock;

    public ClientViaEmail(String email, PlayStation5Stock stock) {
        this.ps5Stock = stock;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Email sent to "+ email + " - PS5 stock: " + ps5Stock.getStock());
    }

}
