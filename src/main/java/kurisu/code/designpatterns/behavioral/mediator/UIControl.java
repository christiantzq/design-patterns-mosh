package kurisu.code.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic Component Class
 * 
 * Communication link with the mediator is through composition.
 * 
 * Note that this has an extra capability to communicate with multiple 
 * mediators at once, not required but a nice to have.
 */
public abstract class UIControl {

    private List<Mediator> observers = new ArrayList<>();

    public void addEventHandler(Mediator observer){
        observers.add(observer);
    }

    protected void notifyObservers(){
        for (Mediator observer : observers) {
            observer.update(); // actual message to Mediator
        }
    }
}
