package kurisu.code.designpatterns.creational.singleton;

/**
 * Simple Singleton
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "christian");

        ConfigManager otherManager = ConfigManager.getInstance();
        System.out.println("name: " + otherManager.get("name"));
    }
}
