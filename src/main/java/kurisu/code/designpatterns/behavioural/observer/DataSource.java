package kurisu.code.designpatterns.behavioural.observer;

import lombok.Getter;
import lombok.Setter;

public class DataSource extends Subject {

    
    @Getter private String value;

    public void setValue(String value) {
        this.value = value;
        notifyObservers();
    }
    

}
