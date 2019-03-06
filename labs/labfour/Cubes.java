package labfour;

import java.util.Scanner;

public class Cubes {

	static void sumOfCubes(long data) {
		long result = 0;
		long temp;

		while (data % 10 != 0) {
			temp = data % 10;
			result = (long) (result + Math.pow(temp, 3));
			data = data / 10;
		}
		System.out.println("result " + result);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the digit");

		try {
			long data = scan.nextLong();
			// call method
			Cubes.sumOfCubes(data);
		} catch (Exception e) {
			System.out.println("Please Input Valid Number");
		}

	}

}
