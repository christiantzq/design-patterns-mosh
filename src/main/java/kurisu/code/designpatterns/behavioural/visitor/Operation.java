package kurisu.code.designpatterns.behavioural.visitor;

// Visitor Interface
public interface Operation {
    
    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
    
}
