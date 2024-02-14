package kurisu.code.designpatterns.creational.decorator;

public class CloudStream implements Stream  {

    
    public void write(String data){

        System.out.println("Storing: " + data);

    }
    
}
