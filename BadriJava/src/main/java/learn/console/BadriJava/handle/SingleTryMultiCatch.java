package learn.console.BadriJava.handle;

import java.util.Scanner;

public class SingleTryMultiCatch 
{
	public static void main(String[] kumar) 
	{
		int kms=0,fuel=0;
		Scanner scan=new Scanner(System.in);
		try
		{
			kms=Integer.parseInt(kumar[0]);
			fuel=Integer.parseInt(kumar[1]);
			System.out.println(kms/fuel);
			throw new NullPointerException();
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException aio)
		{
			System.out.println(aio);
			System.out.println("Enter the kms driven: ");
			kms=scan.nextInt();
			System.out.println("Enter the fuel filled: ");
			fuel=scan.nextInt();
			System.out.println(kms/fuel);
		}
		catch(ArithmeticException am)
		{
			System.out.println(am);
			System.out.println("Fuel shouldn't be ZERO");
			System.out.println("Enter the fuel filled: ");
			fuel=scan.nextInt();
			System.out.println(kms/fuel);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Mileage calculated ");
			scan.close();
		}
	}
}
