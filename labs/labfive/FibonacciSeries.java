package labfive;

import java.util.Scanner;

public class FibonacciSeries {

	static void recursiveMethod(int input)
	{
		int x = 0;
		int y = 1;
		int tot = 0;
		for(int i=2;i<input;i++)
		{
			tot += x + y;
			y = i;
		}
		System.out.println(tot);
	}
	
	static void nonRecursiveMethod(int input){}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a numnber");
		int input = scan.nextInt();
		FibonacciSeries.recursiveMethod(input);
		FibonacciSeries.nonRecursiveMethod(input);
	}

}
