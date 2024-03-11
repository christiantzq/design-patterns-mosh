package kurisu.code.designpatterns.behavioral.chainOfResponsability;

public class Authenticator extends Handler {
    
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authentication");
        if (request.getUsername().equals("admin") && request.getPassword().equals("12345"))
            return false; // FALSE = We're not done processing
        return true; // TRUE = We're done processing (auth failed)
    }
    
}
