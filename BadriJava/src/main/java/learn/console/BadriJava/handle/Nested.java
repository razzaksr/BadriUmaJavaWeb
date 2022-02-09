package learn.console.BadriJava.handle;

import java.util.InputMismatchException;
import java.util.Scanner;

/*bit: & | ^ >> <<
 * logical: && ||
 * 1024 512 256 128 64 32 16 8 4 2 1
 *    0   0   0   0  0  1  1 1 0 0 0 >> 56
 *    0   0   0   0  1  1  0 0 1 0 0 >> 100
 *    0   0   0   0  0  1  0 0 0 0 0 >> 32
 */

public class Nested
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int pos=0,elem=0,second=0;
		int[] arr= {56,89,11,34,10,5,7,3,5,10,98,11,56,44,21,8};
		try
		{
			System.out.println("Tell us position to get : ");
			pos=scan.nextInt();
			elem=arr[pos];
			System.out.println("Tell us second data to do &: ");
			second=scan.nextInt();
			System.out.println(elem&second);
		}
		catch(ArrayIndexOutOfBoundsException aio)
		{
			try
			{
				System.out.println(aio+"\nIndex within "+arr.length);
				System.out.println("Tell us position to get : ");
				pos=scan.nextInt();
				elem=arr[pos];
				System.out.println("Tell us second data to do &: ");
				second=scan.nextInt();
				System.out.println(elem&second);
			}
			catch(InputMismatchException is)
			{
				System.out.println(is+"\nInputs should be numeric");
				Scanner gets=new Scanner(System.in);
				System.out.println("Tell us position to get : ");
				pos=gets.nextInt();
				elem=arr[pos];
				System.out.println("Tell us second data to do &: ");
				second=gets.nextInt();
				System.out.println(elem&second);
				gets.close();
			}
		}
		catch(InputMismatchException is)
		{
			try
			{
				System.out.println(is+"\nInputs should be numeric");
				Scanner gets=new Scanner(System.in);
				System.out.println("Tell us position to get : ");
				pos=gets.nextInt();
				elem=arr[pos];
				System.out.println("Tell us second data to do &: ");
				second=gets.nextInt();
				System.out.println(elem&second);
				gets.close();
			}
			catch(ArrayIndexOutOfBoundsException aio)
			{
				System.out.println(aio+"Index within "+arr.length);
				Scanner gets=new Scanner(System.in);
				System.out.println("Tell us position to get : ");
				pos=gets.nextInt();
				elem=arr[pos];
				System.out.println("Tell us second data to do &: ");
				second=gets.nextInt();
				System.out.println(elem&second);
				gets.close();
			}
		}
		catch(Exception e) {}
		scan.close();
	}
}
