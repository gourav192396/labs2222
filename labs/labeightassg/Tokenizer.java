package labeightassg;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers with spaces to add");
		String input = "";
		// get data with spaces
		input = input + scanner.nextLine();
		// close scanner
		scanner.close();

		StringTokenizer tokenizer = new StringTokenizer(input);
		int sum = 0;
		while (tokenizer.hasMoreElements()) {
			try {
				// add numbers
				Object temp = tokenizer.nextElement();
				sum += Integer.parseInt((String) temp);
				System.out.println(temp);
			} catch (Exception e) {
				System.out.println("Please enter valid numbers");
			}
		}

		System.out.println("Sum is " + sum);
	}

}
