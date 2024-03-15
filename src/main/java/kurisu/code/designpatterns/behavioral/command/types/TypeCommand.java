package kurisu.code.designpatterns.behavioral.command.types;

import kurisu.code.designpatterns.behavioral.command.Robot;

/**
 * Concrete Command
 */
public class TypeCommand implements Command{
    private Robot robot;
    private String text;

    public TypeCommand(Robot robot, String text) {
        this.robot = robot;
        this.text = text;
    }

    @Override
    public void execute() {
        robot.type(text);
    }
    
}
