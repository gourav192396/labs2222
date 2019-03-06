package labten;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream inputStream = new FileInputStream("TUSHAR.txt");
		FileOutputStream outputStream = new FileOutputStream("copy.txt");
		
		//pass data through constructor
		CopyDataThread copyDataThread = new CopyDataThread(inputStream, outputStream);
		
		//create as many as thread you want for fast copy
		Thread thread = new Thread(copyDataThread,"Alfa");
		Thread thread2 = new Thread(copyDataThread,"Beta");
		
		thread.start();
		thread2.start();
	}

}
