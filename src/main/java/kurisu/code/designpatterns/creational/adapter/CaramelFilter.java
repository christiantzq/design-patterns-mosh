package kurisu.code.designpatterns.creational.adapter;

import kurisu.code.designpatterns.creational.adapter.avaFilters.Caramel;

/**
 * Adapter
 * 
 * This would be the actual adapter which uses composition in this case
 * to 'adapt' the ousider Caramel class to our filter in house standards.
 */
public class CaramelFilter implements Filter {
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image img) {
        caramel.init();
        Image newImage = caramel.render(img);
        System.out.println("Caramel filter applied to: " + newImage.toString());
    }
    
}
