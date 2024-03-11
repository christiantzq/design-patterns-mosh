package kurisu.code.designpatterns.behavioral.mediator;

import lombok.Getter;

/**
 * Concrete Component
 */
public class ListBox extends UIControl {
    
    @Getter private String selection;

    public void setSelection(String selection){
        this.selection = selection;        
        notifyObservers(); // Notify mediator(s)
    }

}
