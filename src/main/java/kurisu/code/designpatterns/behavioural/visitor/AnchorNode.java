package kurisu.code.designpatterns.behavioural.visitor;

public class AnchorNode implements HtmlNode {

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
    
}
