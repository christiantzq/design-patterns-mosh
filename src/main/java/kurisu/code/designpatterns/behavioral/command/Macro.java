package kurisu.code.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

import kurisu.code.designpatterns.behavioral.command.types.Command;

/**
 * Invoker
 * 
 * Assembles, holds then allows commands to be executed
 */
public class Macro {
    List<Command> commands = new ArrayList<>();
    
    public void addCommand(Command command){
        this.commands.add(command);
    }

    public void executeMacro(){
        for (Command command : commands) {
            command.execute();
        }
    }
}
