package kurisu.code.designpatterns.creational.factory;

/**
 * Factory design pattern
 * 
 * Basically defer the creation of an immplementation to sub classes by 
 * allowing overriding on the actual creation. All signed with an interface.
 * 
 * This uses ihneritance, does not relly in static methods!!
 */
public class Main {
    public static void main(String[] args) {
        new ProductsController().listProducts();

        // By default this is rendered by Matcha Renderer
        // but we can change the constructor of the immplementation
        // So the renderer creation method is ovveriden
    }
    
}
