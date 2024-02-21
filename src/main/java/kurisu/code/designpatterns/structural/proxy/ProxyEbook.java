package kurisu.code.designpatterns.structural.proxy;

public class ProxyEbook implements Ebook {

    private String fileName;
    private RealEbook ebook;

    public ProxyEbook(String fileName) {
        this.fileName = fileName;
    }

    private void load(){
        System.out.println("Loading the eBook: " + fileName);
    }

    @Override
    public void show(){
        if (ebook == null)
            ebook = new RealEbook(fileName);
        
        ebook.show();
    }

    @Override
    public String getFileName(){
        return fileName;
    }
    
}
