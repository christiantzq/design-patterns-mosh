package kurisu.code.designpatterns.behavioral.chainOfResponsibility;

/**
 * Concrete Handler
 */
public class Logger extends Handler {
    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean concreteHandle(HttpRequest request) {
        System.out.println("Log");
        return false; // FALSE = We're not done processing
    }
    
}
