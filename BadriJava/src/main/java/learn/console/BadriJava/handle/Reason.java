package learn.console.BadriJava.handle;

import java.util.Scanner;

public class Reason 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String ironman="Robert Downey Junior";
		System.out.println("Tell us position to extract");
		try
		{
			System.out.println(ironman.charAt(scan.nextInt()));
			System.out.println("ironmant shattered");
		}
		catch(StringIndexOutOfBoundsException sin)
		{
			//System.out.println(sin);
			sin.printStackTrace();
			System.out.println("Please specify the number within "+ironman.length());
			System.out.println(ironman.charAt(scan.nextInt()));
		}
		finally {
			System.out.println("Extraction done");
		}
		scan.close();
	}
}
