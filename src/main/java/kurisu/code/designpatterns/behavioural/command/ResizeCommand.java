package kurisu.code.designpatterns.behavioural.command;

import kurisu.code.designpatterns.behavioural.command.framework.CommandInterface;

public class ResizeCommand implements CommandInterface {

    @Override
    public void execute() {
        System.out.println("Image Resized.");
    }
    
}
