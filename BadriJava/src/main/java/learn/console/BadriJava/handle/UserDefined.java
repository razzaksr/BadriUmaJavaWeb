package learn.console.BadriJava.handle;

import java.util.Scanner;

public class UserDefined 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double budget=0;
		try
		{
			System.out.println("----------------------Welcome to MarutiSuzuki-----------------");
			System.out.println("Tell us budget: ");
			budget=scan.nextDouble();
			if(budget>=4.5&&budget<=7.1)
			{
				System.out.println("We have Ignis, S-Presso, WagonR for your budget "+budget);
			}
			else if(budget>7.1&&budget<=10)
			{
				System.out.println("We have baleno, Swift, Ciaz, Dzire for your budget "+budget);
			}
			else if(budget>10.1)
			{
				System.out.println("We have S-Cross, XL6, Ertiga for your budget "+budget);
			}
			else {
				System.out.println("No cars matched");
				throw new KumaraganesanException();
			}
		}
		catch(KumaraganesanException kumar)
		{
			System.out.println(kumar);
			UserDefined.main(args);
		}
		scan.close();
	}
}
