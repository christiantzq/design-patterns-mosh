package kurisu.code.designpatterns.structural.decorator;

/**
 * Decorator Design Pattern
 * 
 * Adds functionality of a concrete class by "decorating it".
 * A Decorator basically is another implementation of the concrete class but
 * it adds functionality, and at the end calls the concrete class method (interface)
 * 
 * Note that the order below affects how the workflow behaves. Be carefull can be confusing.
 * The concrete object sould be passed as the very first input of any other decorator
 * 
 * Again check every order of decorator to make sure it's what you want.
 */
public class Main {

    public static void main(String[] args) {
        
        storeCreditCard(new EncryptedCloudStream(new CompresedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream){
        stream.write("1234-1234-1234-1234");
    }
    
}
 