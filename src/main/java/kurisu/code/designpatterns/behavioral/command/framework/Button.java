package kurisu.code.designpatterns.behavioral.command.framework;

import lombok.Getter;
import lombok.Setter;

public class Button {
    @Getter @Setter private String label;
    private CommandInterface command;

    public Button(CommandInterface command){
        this.command = command;
    }

    public void click(){
        command.execute();
    }
    
}
