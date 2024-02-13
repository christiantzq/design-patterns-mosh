package kurisu.code.designpatterns.creational.adapter.avaFilters;

import kurisu.code.designpatterns.creational.adapter.Image;

/**
 * This would be an ousider API
 * (Maybe the code would not be available)
 */
public class Caramel {
    
    public void init(){
        System.out.println("API initialization (required as per external provider)");
    }

    public Image render(Image img){
        return new Image("API(Caramel) for " + img.toString());
    }
}
