package kurisu.code.designpatterns.behavioural.memento;

import lombok.Getter;

// AKA Memento
public class EditorSnapshot {
    
    @Getter private final String content; // Unmutable content!!!

    public EditorSnapshot (String content){
        this.content = content;
    }
}
