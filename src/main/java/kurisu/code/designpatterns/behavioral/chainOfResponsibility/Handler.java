package kurisu.code.designpatterns.behavioral.chainOfResponsibility;

/**
 * Abstract Handler
 */
public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request){
        if(concreteHandle(request))
            return;

        if(next != null){
            next.handle(request);
        }
    }
    
    public abstract boolean concreteHandle(HttpRequest request);
    
}
