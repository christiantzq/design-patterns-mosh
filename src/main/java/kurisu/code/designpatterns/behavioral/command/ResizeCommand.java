package kurisu.code.designpatterns.behavioral.command;

import kurisu.code.designpatterns.behavioral.command.framework.CommandInterface;

public class ResizeCommand implements CommandInterface {

    @Override
    public void execute() {
        System.out.println("Image Resized.");
    }
    
}
