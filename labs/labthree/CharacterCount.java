package labthree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {

	public static Map<String, Integer> getCount(ArrayList<String> character) {
		// To Store Values with count
		Map<String, Integer> counter = new HashMap<String, Integer>();

		for (String letter : character) {
			// Checks if character exists
			// if yes then increase its previous value
			// else store the character with count 1
			if (counter.containsKey(letter)) {
				int currentCount = counter.get(letter);
				counter.put(letter, ++currentCount);
			} else {
				counter.put(letter, 1);
			}
		}
		return counter;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String terminate = "y";

		// To store input
		ArrayList<String> character = new ArrayList<String>();

		while (terminate.equals("y")) {
			System.out.println("Enter a letter");
			// store each char
			character.add(scan.next());
			System.out.println("Do you Wish to Continue? y or n");
			terminate = scan.next();
		}

		// print values
		System.out.println(CharacterCount.getCount(character));

	}

}
