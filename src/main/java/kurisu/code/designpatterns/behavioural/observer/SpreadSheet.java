package kurisu.code.designpatterns.behavioural.observer;

public class SpreadSheet implements Observer {

    @Override
    public void update() {
        System.out.println("Spreadsheet notified.");
    }
    
}
