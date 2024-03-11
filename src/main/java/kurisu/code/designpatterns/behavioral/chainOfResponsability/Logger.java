package kurisu.code.designpatterns.behavioral.chainOfResponsability;

public class Logger extends Handler {
    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Log");
        return false; // FALSE = We're not done processing
    }
    
}
