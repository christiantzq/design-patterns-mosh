package kurisu.code.designpatterns.creational.abstractfactory.ant;

import kurisu.code.designpatterns.creational.abstractfactory.Button;

public class AntButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering Ant Button.");
    }
    
}
