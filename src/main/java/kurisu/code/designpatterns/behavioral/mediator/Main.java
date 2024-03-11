package kurisu.code.designpatterns.behavioral.mediator;

/*
 * Mediator Design Pattern
 * 
 * Defines an object that encapsulates how a set of other objects interact
 * with one another. Restricts direct communications between objects and forces
 * them to collaborate through it, hence reducing the dependencies 
 * between them.
 * 
 * For example, the Control Tower of an airport forces each plane to collaborate
 * between them, directs and orchestrate them for sage landings and takeoffs.
 * 
 *               Mediator
 *              /        \
 *    ComponentA          ComponentB
 */
public class Main {

    public static void main(String[] args) {
        DialogBox dialog = new DialogBox();
        dialog.simulateUserInteraction();        
    }
    
}
