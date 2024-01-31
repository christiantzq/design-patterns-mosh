package kurisu.code.designpatterns.behavioural.command;

import java.util.ArrayList;
import java.util.List;

import kurisu.code.designpatterns.behavioural.command.framework.CommandInterface;

/**
 * This enables to pack a bunch of executable commands that exevute in sequence
 * after executing this one. Neet!
 * 
 */
public class CompositeCommand implements CommandInterface {
    private List<CommandInterface> commands = new ArrayList<>();

    public void add(CommandInterface command){
        commands.add(command);
    }

    @Override
    public void execute() {
        for (CommandInterface cmd : commands) {
            cmd.execute();
        }
    }
    
}
