package labthirteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ProgTwo {

	public static void main(String[] args) {

		// provided string
		String input = "CAPGEMINI";

		// character array
		Character[] charArr = new Character[input.length()];

		// store letters in character array
		for (int i = 0; i < input.length(); i++)
			charArr[i] = input.charAt(i);

		// create stream and pass character array
		Stream<Character> stream = Stream.of(charArr);

		// create consumer to print in our style
		Consumer<Character> consumer = (Character out) -> System.out.print(out+ " ");

		// print all
		stream.forEach(consumer);

	}

}
