package kurisu.code.designpatterns.creational.abstractfactory.ant;

import kurisu.code.designpatterns.creational.abstractfactory.TextBox;

public class AntTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Rendering Ant Text Box");
    }
    
}
