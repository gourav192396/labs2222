package labthree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondShortest {

	int getSecondSmallest(ArrayList<Integer> inputs) {
		//sort the data
		Collections.sort(inputs);
		return inputs.get(1);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String terminate = "y";
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// for asking user inputs
		while (terminate.equals("y")) {
			System.out.println("Enter a Number");
			numbers.add(scan.nextInt());
			System.out.println("Do you Wish to Continue? y or n");
			terminate = scan.next();
		}

		SecondShortest shortest = new SecondShortest();

		// print second smallest
		System.out.println("Second Shortest is "
				+ shortest.getSecondSmallest(numbers));

	}

}
