package labeightassg;

import java.util.Scanner;

public class JobSeeker {

	boolean validate(String userName)
	{
		String job = userName.substring(userName.length()-4,userName.length());
		if(job.equals("_job") && (userName.length()-4)>7)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter User name");
		
		JobSeeker jobSeeker = new JobSeeker();
		if(jobSeeker.validate(scanner.next()))
			System.out.println("Validated");
		else
			System.out.println("Invalid Username");
		
		
	}

}
