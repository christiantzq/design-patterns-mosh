package kurisu.code.designpatterns.creational.abstractfactory.ant;

import kurisu.code.designpatterns.creational.abstractfactory.Button;
import kurisu.code.designpatterns.creational.abstractfactory.TextBox;
import kurisu.code.designpatterns.creational.abstractfactory.WidgerFactory;

public class AntFactory implements WidgerFactory {

    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
    
}
