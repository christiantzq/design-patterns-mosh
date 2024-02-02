package kurisu.code.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kurisu.code.designpatterns.behavioural.*;
import kurisu.code.designpatterns.behavioural.command.CommandDesignPattern;
import kurisu.code.designpatterns.behavioural.command.undoexample.UnduableCommand;
import kurisu.code.designpatterns.behavioural.observer.ObserverDesignPattern;

@SpringBootApplication
public class DesignpatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignpatternsApplication.class, args);

		System.out.println("\n\n\n= = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");

		//new Memento().test();
		//new State().test();
		// new Iterator().test();
		// new Strategy().test();
		// new CommandDesignPattern().test();
		// new UnduableCommand().test();
		new ObserverDesignPattern().test();

		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = =\n\n\n");
	}

}
