package kurisu.code.designpatterns.creational.adapter;

/**
 * Concrete implementation of an image Filter
 * This is just an example of a local implementation, not related to the adapter per se
 */
public class VividFilter implements Filter {

    @Override
    public void apply(Image img) {
        System.out.println("Vivid filter applied to: " + img.toString());
    }
    

}
