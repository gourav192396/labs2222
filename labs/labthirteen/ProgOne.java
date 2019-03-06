package labthirteen;

import java.util.Scanner;
import java.util.stream.Stream;

public class ProgOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the 1st number");
		String x = scanner.next();
		
		System.out.println("Enter the 2nd number");
		String y = scanner.next();
		
		Stream<String> stream = Stream.of(x,y);
		
		double result = stream.map(a->Double.parseDouble(a)).reduce((r,i)->Math.pow(r,i)).get();
		
		System.out.println("X raise to Y is "+result);
	}

}
