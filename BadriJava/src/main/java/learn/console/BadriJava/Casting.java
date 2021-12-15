package learn.console.BadriJava;

import java.util.Scanner;

/*
 * Type conversion:
 * 1. Casting: between data types
 * 		(type)data
 * 2. Parsing:
 */

public class Casting 
{
	public static void main(String[] args) 
	{
		int myDoor=89;
		System.out.println(myDoor);
		System.out.println((float)myDoor+" "+(char)myDoor+" "+(byte)myDoor);
		
		/*
		 * Scanner scan=new Scanner(System.in);
		 * System.out.println("Tell us commercials and days: "); int
		 * commercials=scan.nextInt(); int days=scan.nextInt();
		 * 
		 * int pack=commercials*days;
		 * 
		 * int takeHome=(int)(pack-(pack*0.075));
		 * 
		 * System.out.println("Take home is: "+takeHome);
		 * 
		 * scan.close();
		 */
		
		Character badri='Z',uma='T';
		
		System.out.println("Badri's desired ORG is "+badri+" Uma desired ORG is "+uma);
		
		badri=(char)(badri+uma);
		uma=(char)(badri-uma);
		badri=(char)(badri-uma);
		
		System.out.println("Badri's desired ORG is "+badri+" Uma desired ORG is "+uma);
	}
}
