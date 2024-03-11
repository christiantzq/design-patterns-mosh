package kurisu.code.designpatterns.behavioral.mediator;

import lombok.Getter;

/**
 * Concrete Component
 */
public class Button extends UIControl {

    @Getter private boolean isEnabled;

    public void setEnabled(boolean enabled){
        this.isEnabled = enabled;
        notifyObservers(); // Notify mediator(s)
    }
    
}
