package kurisu.code.designpatterns.creational.adapter;

import kurisu.code.designpatterns.creational.adapter.avaFilters.Caramel;

/**
 * Adapter Design Pattern 
 * 
 * Used when an external API does not match signatures of local code.
 */
public class Main {
    
    public static void main(String[] args) {
        ImageView view = new ImageView(new Image("cool-image.png"));
        view.apply(new VividFilter()); // This is locally coded
        view.apply(new CaramelFilter(new Caramel())); // This is from API
    }
}
