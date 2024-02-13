package kurisu.code.designpatterns.creational.adapter;

public class Image {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
    
}
