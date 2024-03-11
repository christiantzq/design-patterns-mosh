package kurisu.code.designpatterns.behavioral.command.undoexample;

import lombok.Getter;
import lombok.Setter;

public class HtmlDocument {
    
    @Getter @Setter private String content;

    public void makeBold(){
        content = "<b>" + content + "</b>";
    }

}
