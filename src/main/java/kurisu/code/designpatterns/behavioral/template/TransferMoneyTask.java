package kurisu.code.designpatterns.behavioral.template;

public class TransferMoneyTask extends Task {

    @Override
    protected void doExecute() {
        System.out.println("Money Transfered.");
    }
}
