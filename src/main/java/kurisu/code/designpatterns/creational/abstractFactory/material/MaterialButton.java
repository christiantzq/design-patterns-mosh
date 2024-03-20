package kurisu.code.designpatterns.creational.abstractFactory.material;

import kurisu.code.designpatterns.creational.abstractFactory.Button;

public class MaterialButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering a Material Button");
    }
    
}
