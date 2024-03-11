package kurisu.code.designpatterns.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

/*
 * AKA Originator
 * 
 * What you want to save, in this case is just a String.
 */
public class Editor {

    @Getter @Setter private String content;

    public EditorSnapshot createSnapshot(){
        return new EditorSnapshot(content); // Creates copy & returns it.
    }

    // I think this is not required.
    // public void restore(EditorSnapshot state){
    //     content = state.getContent(); // Restores a specific snapshot content?
    // }
    
}
