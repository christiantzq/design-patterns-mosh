package kurisu.code.designpatterns.behavioral.chainOfResponsibility;

/**
 * Concrete Handler
 */
public class Compressor extends Handler {

    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean concreteHandle(HttpRequest request) {
        System.out.println("Compress.");
        return false; // FALSE = we're not done processing
    }
    
}
