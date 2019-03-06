package labeightassg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DisplayData {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("TUSHAR.txt"));
		
		String line;
		int lineCount=0;
		int wordsCount=0;
		int characterCount=0;
		while((line=bufferedReader.readLine())!=null)
		{
			lineCount++;
			characterCount += line.length();
			String[] words = line.split("\\s+");
			wordsCount += words.length;
		}
		
		System.out.println("Line counts are "+lineCount);
		System.out.println("Words counts are "+wordsCount);
		System.out.println("Character counts are "+characterCount);
	}
}
