package learn.console.BadriJava.handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FiniteChances 
{
	public static void help(int chances)
	{
		Scanner scan=new Scanner(System.in);
		String[] avengers= {"CA","Iron Man","Thor","Widow","Wanda","Falcon","Banner","Star lord","Antman","Groot","Rocket"};
		int pos=0;
		
		try
		{
			System.out.println("Tell us position of avenger to get help within "+avengers.length);
			pos=scan.nextInt();
			System.out.println(avengers[pos]+" is here for rescue");
		}
		catch(InputMismatchException is)
		{
			System.out.println(is+"\nIndex in numeric");
			if(chances<=2)
			{
				chances++;
				FiniteChances.help(chances);
			}
			else {
				System.out.println("Maximum no of chances attempted get lost");
			}
		}
		scan.close();
	}
	public static void main(String[] args) 
	{
		FiniteChances.help(1);
	}
}
