package kurisu.code.designpatterns.creational.abstractfactory.app;

import kurisu.code.designpatterns.creational.abstractfactory.WidgerFactory;

public class ContactForm {
    public void render(WidgerFactory factory){

        factory.createButton().render();
        factory.createTextBox().render();
    }
}
