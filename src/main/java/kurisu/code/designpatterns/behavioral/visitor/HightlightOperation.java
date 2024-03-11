package kurisu.code.designpatterns.behavioral.visitor;

public class HightlightOperation implements Operation {

    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Hightlighted Heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Hightlighted anchor");
    }


    
}
