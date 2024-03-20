package kurisu.code.designpatterns.creational.abstractFactory.ant;

import kurisu.code.designpatterns.creational.abstractFactory.Button;

public class AntButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering Ant Button.");
    }
    
}
