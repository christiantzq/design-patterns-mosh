package kurisu.code.designpatterns.behavioral.command.undoexample;

public class BoldCommand implements UndoableCommand,DoableCommand {

    private String prevContent;
    private HtmlDocument document;
    private History history;

    public BoldCommand(HtmlDocument doc, History history){
        this.document = doc;
        this.history = history;
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }
    
}
