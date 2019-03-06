package labeightassg;

import java.util.Scanner;

public class PositiveString {

	public static boolean isPositive(String input)
	{
		char[] chars = input.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if(i!=chars.length-1)
			{
				if(chars[i]>chars[i+1])
					return false;
			}
		}		
		return true;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word");
		if(PositiveString.isPositive(scanner.next()))
			System.out.println("Positive String");
		else
			System.out.println("Not a positive String");
	}

}
