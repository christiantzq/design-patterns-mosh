package kurisu.code.designpatterns.behavioral.command.types;

import kurisu.code.designpatterns.behavioral.command.Robot;

/**
 * Concrete Command
 */
public class DelayCommand implements Command {
    private Robot robot;
    private int milliseconds;

    public DelayCommand(Robot robot, int milliseconds) {
        this.robot = robot;
        this.milliseconds = milliseconds;
    }

    @Override
    public void execute() {
        robot.delay(milliseconds);
    }
    
}
