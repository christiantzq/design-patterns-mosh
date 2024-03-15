package kurisu.code.designpatterns.behavioral.command.types;

import kurisu.code.designpatterns.behavioral.command.Robot;

/**
 * Concrete Command
 */
public class KeystrokeCommand implements Command {
    private Robot robot;
    private int keyId;

    public KeystrokeCommand(Robot robot, int keyId) {
        this.robot = robot;
        this.keyId = keyId;
    }
    
    @Override
    public void execute() {
        robot.keyPress(keyId);
        robot.keyRelease(keyId);
    }
    
}

