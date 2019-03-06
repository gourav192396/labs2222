package labthree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UpperCaseSort {

	public static ArrayList<String> getCaseSort(ArrayList<String> input) {
		// Sort in alphabetically
		Collections.sort(input);

		// length of array
		int length = input.size();

		// find if even or odd
		int findHalf = ((length % 2 == 0) ? length / 2 : (length / 2) + 1);
		
		// convert to case
		for (int i = 0; i < length; i++) {
			if (i <= (findHalf - 1))
				input.set(i, input.get(i).toUpperCase());
			else
				input.set(i, input.get(i).toLowerCase());
		}

		// print array
		return input;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String terminate = "y";

		// DECLARE ARRAY
		ArrayList<String> input = new ArrayList<String>();

		while (terminate.equals("y")) {
			System.out.println("Enter a Word");
			input.add(scan.next());
			System.out.println("Do you Wish to Continue? y or n");
			terminate = scan.next();
		}

		System.out.println(UpperCaseSort.getCaseSort(input));
	}

}
