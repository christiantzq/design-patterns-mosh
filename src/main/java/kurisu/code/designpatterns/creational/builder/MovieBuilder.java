package kurisu.code.designpatterns.creational.builder;

import lombok.Getter;

public class MovieBuilder implements PresentationBuilder {
    @Getter private MovieDocument movie = new MovieDocument();

    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText(), 5);
    }
    
}
