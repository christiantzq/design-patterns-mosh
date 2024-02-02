package kurisu.code.designpatterns.behavioural.observer;

/**
 * Observer (Publisher / Subscriptor)
 * 
 * Used when you wanto to comunicate changes on some data from one source to several (Broadcast)
 * 
 * The subscriver also has the ability to query the data when it needs it.
 */
public class ObserverDesignPattern {

    public void test(){
        DataSource dataSource = new DataSource();
        SpreadSheet excel = new SpreadSheet(dataSource);
        Chart chart = new Chart(dataSource);

        dataSource.addObserver(chart);
        dataSource.addObserver(excel);

        dataSource.setValue("Hello, World!");

    }
    
}
