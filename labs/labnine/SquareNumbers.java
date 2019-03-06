package labnine;

import java.util.HashMap;
import java.util.Map;

public class SquareNumbers {

	public Map getSquares(int[] numbers)
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();

		int cntr = 0;
		for (int i : numbers) {
			map.put(i, i*i);
		}
		return map;
	}
	public static void main(String[] args) {
		
		int[] nums = {12,13,15,9};
		SquareNumbers squareNumbers = new SquareNumbers();
		System.out.println(squareNumbers.getSquares(nums));
	}

}
