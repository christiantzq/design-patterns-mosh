package kurisu.code.designpatterns.behavioural.mediator;

import lombok.Getter;

public class TextBox extends UIControl {

    @Getter private String content;

    public void setContent(String content){
        this.content = content;
        // owner.changed(this);
        notifyObservers();

    }
    
}
