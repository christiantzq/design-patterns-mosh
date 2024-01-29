package kurisu.code.designpatterns.behavioural.template;

public class TransferMoneyTask extends Task {

    @Override
    protected void doExecute() {
        System.out.println("Money Transfered.");
    }
}
