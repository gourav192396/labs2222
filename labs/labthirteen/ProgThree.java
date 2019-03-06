package labthirteen;

import java.util.Scanner;
import java.util.stream.Stream;

import labeight.Person;

public class ProgThree {

	public static void main(String[] args) {
		
		//Set Right credentials
		String rightUsername = "tushar";
		String rightPassword = "P@ssw0rd";
		
		Scanner scanner = new Scanner(System.in);
		
		//store username
		System.out.println("Enter username");
		String userName = scanner.next();
		
		//store password
		System.out.println("Enter password");
		String password = scanner.next();
		
		//create a class for username and password
		//pass inputs to login constructor
		Login login = new Login(userName, password);
		
		//create Stream and pass login obj
		Stream<Login> stream = Stream.of(login);
		
		//main logic
		//use getters to get username and password from login class
		boolean isValid = stream.anyMatch(x->x.getUsername().equals(rightUsername) && x.getPassword().equals(rightPassword));
		
		//display output
		if(isValid)
			System.out.println("Login Successfull");
		else
			System.out.println("Invalid Login");
	}
}
