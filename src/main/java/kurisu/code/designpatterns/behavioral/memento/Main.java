package kurisu.code.designpatterns.behavioral.memento;

/**
 * Memento Design Pattern (AKA the Snapshot)
 * 
 * Allows you to save and restore the previous state of
 * an object without revealing the details of its implementation.
 * 
 * Originator -> What you want to save
 * 
 * Memento -> A Snapshot in time of the Originator (Un-mutable copy)
 * 
 * History -> A stack of snapshots, to be used as an "undo".
 * 
 * Note: This makes copies every time, watch for memory usage.
 */
public class Main {

    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("Hello, world!");
        history.push(editor.createSnapshot()); // auto save

        editor.setContent("Oh my, this won't be saved?");
        history.push(editor.createSnapshot()); // auto save

        editor.setContent("But this will, yes??");
        history.push(editor.createSnapshot()); // auto save

        editor.setContent("Newest conten, printed but not saved.");

        /*
         * And now the "Undos"...
         * 
         * Note that we can skip setting the content, we do not have to write to
         * setConten, if we only do history.pop() that will gets us bak in time as well.
         */
        editor.setContent(history.pop().getContent());  // Undo
        history.pop();                                  // Undo (no content update)
        editor.setContent(history.pop().getContent());  // Undo

        // Print last (current) content view status:
        System.out.println(editor.getContent());
    }
}
