package kurisu.code.designpatterns.behavioural.visitor;

/**
 * Visitor Pattern
 * 
 * Allos do add operrations to a stable base of types that implement the visitor interface.
 * Works best if new types are added scarcely.
 * 
 */
public class Main {
    
    public static void main(String[] args) {
        HtmlDocument doc = new HtmlDocument();
        doc.add(new HeadingNode());
        doc.add(new AnchorNode());
        doc.execute(new HightlightOperation());
    }
}
