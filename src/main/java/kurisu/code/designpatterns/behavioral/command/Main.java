package kurisu.code.designpatterns.behavioral.command;

import kurisu.code.designpatterns.behavioral.command.types.DelayCommand;
import kurisu.code.designpatterns.behavioral.command.types.KeystrokeCommand;
import kurisu.code.designpatterns.behavioral.command.types.TypeCommand;

/**
 * Command Design Pattern
 * 
 * Allows to turn a request or a behavior unto a stand-alone object that contains
 * everything about that request. It encapsulates all the relevant information needed
 * to perform an action or trigger an event.
 * 
 *   Invoker -> Command:execute()
 *                  \
 *            ConcreteCommand -> Receiver
 * 
 * Separating the request logic from the Invoker to the Receiver, we can queue, store
 * or serialize the commands separately.
 */
public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot(); // The API

        Macro macro = new Macro();
        macro.addCommand(new TypeCommand(robot, "Hello, World!"));
        macro.addCommand(new KeystrokeCommand(robot, 63)); // Enter
        macro.addCommand(new DelayCommand(robot, 1000));
        macro.addCommand(new TypeCommand(robot, "Macro is done."));
        macro.executeMacro();
    }
}
