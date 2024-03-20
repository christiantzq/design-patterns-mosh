package kurisu.code.designpatterns.creational.abstractFactory.material;

import kurisu.code.designpatterns.creational.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Rendering Material Text Box");
    }
    
}
