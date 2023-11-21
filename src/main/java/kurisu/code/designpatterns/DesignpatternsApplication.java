package kurisu.code.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kurisu.code.designpatterns.behavioural.*;

@SpringBootApplication
public class DesignpatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignpatternsApplication.class, args);

		System.out.println("\n\n\n= = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");

		//new Memento().test();
		new State().test();

		System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = =\n\n\n");
	}

}
