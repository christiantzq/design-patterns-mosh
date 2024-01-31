package kurisu.code.designpatterns.behavioural.command;

import kurisu.code.designpatterns.behavioural.command.framework.CommandInterface;

public class MonochromeCommand implements CommandInterface {

    @Override
    public void execute() {
        System.out.println("Image is now black and white.");
    }
    
}
