package kurisu.code.designpatterns.creational.abstractFactory;

/**
 * Abstract Factory Interface
 * 
 * This could be an abstract class instead, the concrete factories would
 * inherit it and implement the same abstract methods as below.
 * 
 * The signatures here define all the types of products this factory will
 * be able to handle.
 * 
 * In this case, concrete implementation should be able to deliver
 * Buttons and TextBoxes.
 */
public interface WidgetFactory {
    Button createButton();
    TextBox createTextBox();
}
