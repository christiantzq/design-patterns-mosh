package kurisu.code.designpatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

public class Circle implements Component {
    @Setter @Getter private int radius = 0;



    
    @Override
    public void render() {
        System.out.println("Rendering a circle of radius:" + radius);
    }


    @Override
    public Component cloneV2() {
        Circle circle = new Circle();
        circle.setRadius(radius);
        return circle;
    }

    


    
}
