package kurisu.code.designpatterns.behavioural.memento;

import java.util.Deque;
import java.util.LinkedList;

// AKA Caretaker
public class History {
    
    private Deque<EditorSnapshot> states = new LinkedList<EditorSnapshot>(); // a stack

    public void push(EditorSnapshot editor){
        states.push(editor);
    }

    public EditorSnapshot pop(){
        return states.pop();
    }

}
