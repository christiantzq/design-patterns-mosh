package kurisu.code.designpatterns.behavioral.template;

/**
 * The idea in this example is to FORCE a trail code whenever a Task is executed.
 * 
 * It forces an implementation of a generic Task to be ran with the main execute()
 * method for commiting a transaction.
 * 
 * it Allows custom implementation on the doExecute() method for each particular
 * implementation.
 * 
 * FYI, protected should hide the doExecute from the ouside, not doing it here so
 * I commited inside the execute as a way of forcing the trail.
 */
public class Template {
    
    public void test(){
        Task task = new TransferMoneyTask();
        task.execute();
    }
}
 

