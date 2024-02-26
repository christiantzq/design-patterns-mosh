package kurisu.code.designpatterns.creational.abstractfactory.material;

import kurisu.code.designpatterns.creational.abstractfactory.TextBox;

public class MaterialTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Rendering Material Text Box");
    }
    
}
