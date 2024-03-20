package kurisu.code.designpatterns.creational.abstractFactory;

/**
 * This simply makes use of a factory
 * 
 * 
 */
public class MyForm {
    public void render(WidgetFactory factory){
        factory.createButton().render();
        factory.createTextBox().render();
    }
}
