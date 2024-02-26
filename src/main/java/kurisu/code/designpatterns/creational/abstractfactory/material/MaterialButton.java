package kurisu.code.designpatterns.creational.abstractfactory.material;

import kurisu.code.designpatterns.creational.abstractfactory.Button;

public class MaterialButton implements Button {

    @Override
    public void render() {
        System.out.println("Renderign a Material Burron");
    }
    
}
