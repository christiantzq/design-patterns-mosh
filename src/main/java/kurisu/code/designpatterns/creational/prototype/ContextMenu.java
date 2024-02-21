package kurisu.code.designpatterns.creational.prototype;

public class ContextMenu {
    public void douplicate(Component component){
        Component newComp = component.cloneV2();

        System.out.println("Added new cloned component and added to document");
    }
    
}
