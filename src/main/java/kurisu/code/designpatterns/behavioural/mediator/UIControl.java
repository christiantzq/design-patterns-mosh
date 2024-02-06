package kurisu.code.designpatterns.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    // protected DialogBox owner; Removed to set up the observer pattern

    // public UIControl(DialogBox owner){
    //     this.owner = owner;
    // }

    private List<Observer> observers = new ArrayList<>();

    public void addEventHandler(Observer observer){
        observers.add(observer);
    }

    protected void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
