package kurisu.code.designpatterns.creational.abstractFactory;

import kurisu.code.designpatterns.creational.abstractFactory.ant.AntFactory;
import kurisu.code.designpatterns.creational.abstractFactory.material.MaterialFactory;

/**
 * Abstract Factory Design Pattern
 * 
 * Allows you to produce families of related objects without specifying 
 * their concrete classes.
 * 
 * For example, two different themes for rendering widgets, Ant and Material.
 * Each theme implements their own way of rendering the widgets.
 * 
 * Note: Not to be confused with the Factory Method pattern. * 
 */
public class Main {

    public static void main(String[] args) {
        
        new MyForm().render(new MaterialFactory());

        new MyForm().render(new AntFactory());
    }
    
}
