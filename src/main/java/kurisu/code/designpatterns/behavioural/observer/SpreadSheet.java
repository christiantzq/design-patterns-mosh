package kurisu.code.designpatterns.behavioural.observer;

public class SpreadSheet implements Observer {
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spreadsheet notified with new value: " + dataSource.getValue());
    }
    
}
