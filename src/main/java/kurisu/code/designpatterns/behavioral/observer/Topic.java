package kurisu.code.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Publisher/Topic/Subject
 * 
 * Contains the list of subscribers
 */
public class Topic {
    private List<Subscriber> observers = new ArrayList<>();

    // Subscribe
    public void addSubscriber(Subscriber observer){
        observers.add(observer);
    }

    // Unsubscribe
    public void removeSubscriber(Subscriber observer){
        if(observers.contains(observer))
            observers.remove(observer);
        else
            System.out.println("No subscriber was removed (subscriber not found)");
    }

    // Alert subscribers
    public void notifySubscribers(){
        for (Subscriber observer : observers) {
            observer.update();
        }
    }
}
