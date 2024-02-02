package kurisu.code.designpatterns.behavioural.observer;

public class ObserverDesignPattern {

    public void test(){
        DataSource dataSource = new DataSource();
        SpreadSheet excel = new SpreadSheet();
        Chart chart = new Chart();

        dataSource.addObserver(chart);
        dataSource.addObserver(excel);

        dataSource.setValue("valor compa!");

    }
    
}
