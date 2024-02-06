package kurisu.code.designpatterns.behavioural.mediator;

import lombok.Getter;

public class Button extends UIControl {

    // public Button(DialogBox owner) { // Deleted to add observer
    //     super(owner);
    // }

    @Getter private boolean isEnabled;

    public void setEnabled(boolean enabled){
        this.isEnabled = enabled;
        // owner.changed(this);
        notifyObservers();
    }
    
}
