package labeightassg;

import java.io.File;
import java.util.Scanner;

public class FilesProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the file name with extension");
		String name = scan.next();
		
		File file = new File(name);
		if(file.exists())
		{
			if(file.canRead())
				System.out.println("File is Readable");
			else
				System.out.println("File is NOT Readable");
			
			if(file.canWrite())
				System.out.println("File is Writable");
			else
				System.out.println("File is NOT Writable");
			
			System.out.println("File length is "+file.length()+" bytes");
			System.out.println("File extension is "+name.substring(name.indexOf("."),name.length()));
		}
		else
		{
			System.out.println("No Such File Found");
		}
	}

}
