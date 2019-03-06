package labeightassg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("TUSHAR.txt"));
		
		String line;
		int lineCounter = 0;
		while((line=bufferedReader.readLine())!=null)
			System.out.println((++lineCounter) +" "+line);
	}
}
