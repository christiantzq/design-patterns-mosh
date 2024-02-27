package kurisu.code.designpatterns.creational.builder;

import lombok.Getter;

public class PdfDocumentBuilder implements PresentationBuilder{

    @Getter private PdfDocument doc = new PdfDocument();
    


    @Override
    public void addSlide(Slide slide) {
        doc.addPage(slide.getText());
    }
    
}
