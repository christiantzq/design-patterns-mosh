package kurisu.code.designpatterns.behavioral.visitor;

// Visitor Interface
public interface Operation {
    
    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
    
}
