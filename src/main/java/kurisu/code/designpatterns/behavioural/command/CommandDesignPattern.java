package kurisu.code.designpatterns.behavioural.command;

import kurisu.code.designpatterns.behavioural.command.framework.Button;
import kurisu.code.designpatterns.behavioural.command.framework.CommandInterface;

/**
 * Command Design Pattern
 * 
 * Helps to decouple de Invoker from the Receiver.
 * 
 * Acts as a middle ware to execute some action. 
 */
public class CommandDesignPattern {
    
    public void test(){
        CustomerService service = new CustomerService();
        CommandInterface command = new AddCustomerCommand(service);
        Button button = new Button(command);
        button.click();
    }
}
