package kurisu.code.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

// AKA Observable
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        if(observers.contains(observer))
            observers.remove(observer);
        else
            System.out.println("No observer was removed (observer not found)");
    }

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
