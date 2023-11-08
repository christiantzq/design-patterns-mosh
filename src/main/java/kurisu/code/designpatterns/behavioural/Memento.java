package kurisu.code.designpatterns.behavioural;

import java.util.Deque;
import java.util.LinkedList;

import lombok.Getter;
import lombok.Setter;

/**
 * Memento Design Pattern
 * 
 * AKA the snapshot. Memento lets you save and restore the previous state of 
 * an object without revealing the details of its implementation.
 * 
 * Originator -> What you want to save
 * 
 * Memento -> A Snapshot in time of the Originator
 * 
 * History -> A stack of snapshots, like an undo
 * 
 */
public class Memento {
    public void test(){
        var editor = new Editor();
        var history = new History();

        editor.setContent("Hello, world!");
        history.push(editor.createSnapshot());

        editor.setContent("Oh my, this won't be saved?");
        history.push(editor.createSnapshot());

        editor.setContent("But this will, yes!");
        history.push(editor.createSnapshot());

        history.pop();
        history.pop();
        editor.setContent(history.pop().getContent());

        System.out.println(editor.getContent());
    }
}

class Editor { // Originator
    @Getter @Setter private String content;

    public EditorSnapshot createSnapshot(){
        return new EditorSnapshot(content);
    }

    public void restore(EditorSnapshot state){
        content = state.getContent();
    }
    
}

class EditorSnapshot { // Memento
    @Getter private final String content;

    public EditorSnapshot (String content){
        this.content = content;
    }
}

class History { // Caretaker
    private Deque<EditorSnapshot> states = new LinkedList<EditorSnapshot>(); // Stack

    public void push(EditorSnapshot editor){
        states.push(editor);
    }

    public EditorSnapshot pop(){
        return states.pop();
    }

}