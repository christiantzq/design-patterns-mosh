package kurisu.code.designpatterns.behavioral.command;

import kurisu.code.designpatterns.behavioral.command.framework.CommandInterface;

public class AddCustomerCommand implements CommandInterface{
    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
    
}
