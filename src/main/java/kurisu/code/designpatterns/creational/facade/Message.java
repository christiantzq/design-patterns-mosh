package kurisu.code.designpatterns.creational.facade;

import lombok.Getter;
import lombok.Setter;

public class Message {
    @Getter @Setter private String content;

    public Message(String content) {
        this.content = content;
    }

    
}
