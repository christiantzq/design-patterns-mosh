package kurisu.code.designpatterns.creational.abstractfactory.material;

import kurisu.code.designpatterns.creational.abstractfactory.Button;
import kurisu.code.designpatterns.creational.abstractfactory.TextBox;
import kurisu.code.designpatterns.creational.abstractfactory.WidgerFactory;

public class MaterialFactory implements WidgerFactory {

    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
    
}
