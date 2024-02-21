package kurisu.code.designpatterns.structural.flyweight;

/**
 * Flyweight Pattern
 * 
 * Basically its a cashe, separates data that can be similar. Uses a Hashmap to
 * store if new or retrieve if existent.
 * 
 * All these is encapsulated in a factory object.
 */
public class Main {
    public static void main(String[] args) {
        PointService service = new PointService(new PointIconFactory());
        for (Point point : service.getPoints()) {
            point.draw();
        }
    }
    
}
 