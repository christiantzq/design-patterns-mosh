package kurisu.code.designpatterns.behavioral.command.undoexample;

public class UndoCommand implements DoableCommand {
    private History history;

    public UndoCommand(History history){
        this.history = history;

    }

    @Override
    public void execute() {
        
        if(history.size() > 0)
            history.pop().unexecute();
    }
    
}
