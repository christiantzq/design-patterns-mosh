package kurisu.code.designpatterns.behavioral.mediator;

import lombok.Getter;

/**
 * Concrete Component
 */
public class TextBox extends UIControl {

    @Getter private String content;

    public void setContent(String content){
        this.content = content;
        notifyObservers(); // Notify mediator(s)
    }
    
}
