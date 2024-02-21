package kurisu.code.designpatterns.structural.proxy;

public class RealEbook implements Ebook {

    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
    }

    private void load(){
        System.out.println("Loading the eBook: " + fileName);
    }

    @Override
    public void show(){
        load();
        System.out.println("Showing the ebook: " + fileName);
    }

    @Override
    public String getFileName(){
        return fileName;
    }
    
}
