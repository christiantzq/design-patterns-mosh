package kurisu.code.designpatterns.creational.abstractfactory;

import kurisu.code.designpatterns.creational.abstractfactory.ant.AntFactory;
import kurisu.code.designpatterns.creational.abstractfactory.app.ContactForm;
import kurisu.code.designpatterns.creational.abstractfactory.material.MaterialFactory;

/**
 * Abstract Factory Design Pattern
 * 
 * This is often confused with Factory Method, in this case not a method
 * but an interface with two concrete immplementations.
 * 
 * Basicalle declares a base skeleton of interfaces and then a concrete factory.
 * 
 */
public class Main {

    public static void main(String[] args) {
        
        new ContactForm().render(new MaterialFactory());

        new ContactForm().render(new AntFactory());
    }
    
}
