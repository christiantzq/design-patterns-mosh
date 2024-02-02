package kurisu.code.designpatterns.behavioural.observer;

public class Chart implements Observer{
    private DataSource dataSource;

    public Chart(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart notified with new value: " + dataSource.getValue() );
    }
    
}
