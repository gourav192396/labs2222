package labthirteen;

import java.util.function.Consumer;

interface ProgInterface {
	void callMeAlways();
}

public class ProgFour {

	static void say() {
		System.out.println("Called using static method");
	}

	void sayNew() {
		System.out.println("Called using method reference");
	}

	public ProgFour() {
		System.out.println("Constructor called");
	}

	public static void main(String[] args) {

		// Containing class with static method name
		ProgInterface interface1 = ProgFour::say;
		interface1.callMeAlways();

		// calling object with its method
		ProgFour progFour = new ProgFour();
		ProgInterface interface2 = progFour::sayNew;
		interface2.callMeAlways();

		// calling constructor
		ProgInterface interface3 = ProgFour::new;
		interface3.callMeAlways();

		// printing our own class methods
		// need to create a consumer
		// Used toString
		Login login = new Login("tushar", "P@ssw0rd");
		Consumer<Login> consumer = System.out::println;//will call toString method
		consumer.accept(login);
	}
}
