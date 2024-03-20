package kurisu.code.designpatterns.creational.abstractFactory.ant;

import kurisu.code.designpatterns.creational.abstractFactory.Button;
import kurisu.code.designpatterns.creational.abstractFactory.TextBox;
import kurisu.code.designpatterns.creational.abstractFactory.WidgetFactory;

/**
 * Concrete factory
 */
public class AntFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
    
}
