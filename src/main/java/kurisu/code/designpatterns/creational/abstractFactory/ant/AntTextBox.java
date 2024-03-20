package kurisu.code.designpatterns.creational.abstractFactory.ant;

import kurisu.code.designpatterns.creational.abstractFactory.TextBox;

public class AntTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Rendering Ant Text Box");
    }
    
}
