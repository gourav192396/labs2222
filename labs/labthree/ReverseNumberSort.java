package labthree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseNumberSort {

	public static ArrayList<Integer> getSorted(ArrayList<String> original) {

		// To store the result
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// Reverse it
		for (String org : original) {
			String temp = new StringBuilder(org).reverse().toString();
			numbers.add(Integer.parseInt(temp));
		}

		// sort
		Collections.sort(numbers);
		return numbers;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String terminate = "y";

		// To store original data
		ArrayList<String> original = new ArrayList<String>();

		while (terminate.equals("y")) {
			System.out.println("Enter a Number");
			original.add(scan.next());
			System.out.println("Do you Wish to Continue? y or n");
			terminate = scan.next();
		}

		// print array
		System.out.println(ReverseNumberSort.getSorted(original));
	}
}
