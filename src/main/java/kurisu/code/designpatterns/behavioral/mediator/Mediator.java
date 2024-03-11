package kurisu.code.designpatterns.behavioral.mediator;

/**
 * Mediator Interface (AKA Observer or Listener interface)
 * 
 * Declares the methods in which the means of communication between our
 * components is specified
 */
public interface Mediator {

    void update(); // Should handle/execute an message/action from a Component
    
}
