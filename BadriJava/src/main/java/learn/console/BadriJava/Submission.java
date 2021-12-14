package learn.console.BadriJava;

import java.util.Scanner;

public class Submission 
{
	public static void main(String[] args) 
	{
		/*
		 * String fName="Badrinath",lName="S",email="badrinaths@gmail.com",password=
		 * "badrisalem"; Long mobile=87654567345L;Integer age=22;
		 */
		
		// initialization
		
		Scanner uma=new Scanner(System.in);
		
		String fName="",lName="",email="",password="";
		Long mobile=0L;Integer age=0;
		
		System.out.println("Tell us your first name");
		fName=uma.nextLine();
		System.out.println("Tell us your last name");
		lName=uma.nextLine();
		System.out.println("Tell us email");
		email=uma.next();
		System.out.println("Tell us password");
		password=uma.next();
		System.out.println("Tell us your contact number");
		mobile=uma.nextLong();
		System.out.println("Tell us age: ");
		age=uma.nextInt();
		
		System.out.println(fName+" thanks for openning account "+email+" in GMAIL confirmation has sent to "+mobile);
		
		uma.close();
		
	}
}
