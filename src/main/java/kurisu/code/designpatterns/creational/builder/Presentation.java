package kurisu.code.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide){
        slides.add(slide);
    }


    public void export(PresentationBuilder builder){
        builder.addSlide(new Slide("Copyright"));
        for (Slide slide : slides) {
            builder.addSlide(slide);
        }

        // DePRECATED
        // if (format == Format.PDF){
        //     PdfDocument doc = new PdfDocument();
        //     for (Slide slide : slides) {
        //         doc.addPage(slide.getText());
        //     }
        // } else if (format == Format.MOVIE){
        //     MovieDocument doc = new MovieDocument();
        //     for (Slide slide : slides) {
        //         doc.addFrame(slide.getText(), 5);
        //     }
        // }

    }
    
}
