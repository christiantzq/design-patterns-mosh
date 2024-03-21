package kurisu.code.designpatterns.creational.builder;

/**
 * Builder Pattern
 * 
 * Allows you to produce different types and representation of an object 
 * using the same construction process.
 * 
 * For Example, to create a car
 */
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
