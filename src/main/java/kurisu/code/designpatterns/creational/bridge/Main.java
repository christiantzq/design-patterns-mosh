package kurisu.code.designpatterns.creational.bridge;

/**
 * Bridge Pattern
 * 
 * When you have a hirarquie that grows in two separate directions
 * 
 * you can link both of those by adding a bridge. Than means to link them by
 * adding one to the other via composition, as a parameter of the other
 * then implementing required methods by using that inside its own methods.
 * 
 * This is similar as we use a Service class inside a Controller class in spring.
 */
public class Main {

    public static void main(String[] args) {
        
        RemoteControl remote = new RemoteControl(new SonyTv());
        remote.turnOn();

        RemoteControl remoteAd = new AdvancedRemoteControl(new SamsungTv());
        remoteAd.turnOn();
    }
    
}
