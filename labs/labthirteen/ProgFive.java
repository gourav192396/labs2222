package labthirteen;

import java.util.Scanner;

//created functional interface
interface FactInterface{
	void callAlwaysMe(int input);
}

//main class
public class ProgFive {

	//for static reference
	static void calcFactorial(int input) {
		int i, fact = 1;
		for (i = 1; i <= input; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + input + " is: " + fact);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = scanner.nextInt();
		
		//calling by classname and method name
		FactInterface interface1 = ProgFive::calcFactorial;
		interface1.callAlwaysMe(input);
	}

}
