package kurisu.code.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));
        
        PdfDocumentBuilder pdfBuilder = new PdfDocumentBuilder();
        presentation.export(pdfBuilder);
        PdfDocument pdf = pdfBuilder.getDoc();
        
        
        MovieBuilder builder = new MovieBuilder();
        presentation.export(builder);
        MovieDocument mov = builder.getMovie();


    }
    
}
