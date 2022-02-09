package learn.console.BadriJava.handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tact 
{
	static double alpha,beta;
	public static void greet()
	{
		Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("Enter the value for alpha and beta");
			alpha=scan.nextDouble();
			beta=scan.nextDouble();
			System.out.println(alpha+" "+beta+" before swap");
			alpha*=beta;
			beta=alpha/beta;
			alpha/=beta;
			System.out.println(alpha+" "+beta+" after swap");
		}
		catch(InputMismatchException is)
		{
			System.out.println(is+"\nenter only numeric decimal point values");
			throw is;
		}
	}
	public static void main(String[] args) 
	{
		try {
		Tact.greet();
		}
		catch(InputMismatchException ip)
		{
			System.out.println(ip+"\n@ Main");
			Scanner scans=new Scanner(System.in);
			alpha=scans.nextDouble();
			beta=scans.nextDouble();
			System.out.println(alpha+" "+beta+" before swap");
			alpha*=beta;
			beta=alpha/beta;
			alpha/=beta;
			System.out.println(alpha+" "+beta+" after swap");
		}
	}
}