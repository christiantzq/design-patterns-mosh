package kurisu.code.designpatterns.structural.proxy;

public class LoggingEbookProxy implements Ebook {
    private String fileName;
    private RealEbook ebook;

    

    public LoggingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(ebook == null)
            ebook = new RealEbook(fileName);

        System.out.println("Performing some logging");
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
    
}
