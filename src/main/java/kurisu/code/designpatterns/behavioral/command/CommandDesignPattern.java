package kurisu.code.designpatterns.behavioral.command;

import kurisu.code.designpatterns.behavioral.command.framework.Button;
import kurisu.code.designpatterns.behavioral.command.framework.CommandInterface;

/**
 * Command Design Pattern
 * 
 * Helps to decouple de Invoker from the Receiver.
 * 
 * Acts as a middle ware to execute some action. 
 * 
 * Check out the composite command to pack a bunch of these into a single one!!
 */
public class CommandDesignPattern {
    
    public void test(){
        CustomerService service = new CustomerService();
        CommandInterface command = new AddCustomerCommand(service);
        Button button = new Button(command);
        button.click();

        CompositeCommand comp = new CompositeCommand();
        System.out.println("----------- Executing composite command: ---------");
        comp.add(new MonochromeCommand());
        comp.add(new ResizeCommand());
        comp.execute();
    }
}
