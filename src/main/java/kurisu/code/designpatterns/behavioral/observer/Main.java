package kurisu.code.designpatterns.behavioral.observer;

/**
 * Observer (AKA Subscriber)
 * 
 * Used when you want to communicate changes of particular data from one publisher (topic/subject)
 * to several subscribers.
 * 
 * For example, GameStop creates a PS5 "in stock" Topic which holds the list of any client
 * that is interested in the current availability of the PS5 in that store. Whenever the 
 * available stock of PS5s changes, all the subscribed clients will be notified either
 * via SMS, Email or both.
 */
public class Main {
    public static void main(String[] args) {
        PlayStation5Stock ps5Stock = new PlayStation5Stock();

        ClientViaMobile clientPhoneData = new ClientViaMobile("505 365 6843", ps5Stock);
        ClientViaEmail clientEmailData = new ClientViaEmail("christiantzq@gmail.com", ps5Stock);

        ps5Stock.addSubscriber(clientEmailData);
        ps5Stock.addSubscriber(clientPhoneData);

        ps5Stock.setStock(7);
    }
}
