package kurisu.code.designpatterns.behavioural.command.undoexample;

public class UnduableCommand {

    public void test(){
        History history = new History();
        HtmlDocument document = new HtmlDocument();
        document.setContent("Hello World");
        System.err.println("content: " + document.getContent());

        BoldCommand bold = new BoldCommand(document, history);
        bold.execute();

        System.err.println("content: " + document.getContent());

        UndoCommand undo = new UndoCommand(history);
        undo.execute();

        System.err.println("content: " + document.getContent());
    }
    
}
