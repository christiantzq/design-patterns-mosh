package kurisu.code.designpatterns.creational.abstractFactory.material;

import kurisu.code.designpatterns.creational.abstractFactory.Button;
import kurisu.code.designpatterns.creational.abstractFactory.TextBox;
import kurisu.code.designpatterns.creational.abstractFactory.WidgetFactory;

/**
 * Concrete factory
 */
public class MaterialFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
    
}
