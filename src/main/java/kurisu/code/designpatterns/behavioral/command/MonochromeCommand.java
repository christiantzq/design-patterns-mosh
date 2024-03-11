package kurisu.code.designpatterns.behavioral.command;

import kurisu.code.designpatterns.behavioral.command.framework.CommandInterface;

public class MonochromeCommand implements CommandInterface {

    @Override
    public void execute() {
        System.out.println("Image is now black and white.");
    }
    
}
