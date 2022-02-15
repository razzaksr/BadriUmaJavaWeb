package learn.console.BadriJava.handle;

import java.util.Scanner;

public class InfiniteChances 
{
	public static void help()
	{
		Scanner scan=new Scanner(System.in);
		String[] avengers= {"CA","Iron Man","Thor","Widow","Wanda","Falcon","Banner","Star lord","Antman","Groot","Rocket"};
		int pos=0;
		
		try
		{
			System.out.println("Tell us position of avenger to get help");
			pos=scan.nextInt();
			System.out.println(avengers[pos]+" is here for rescue");
		}
		catch(ArrayIndexOutOfBoundsException aio)
		{
			System.out.println(aio+"\nEnter the index within the "+avengers.length);
			InfiniteChances.help();
		}
		
		scan.close();
	}
	public static void main(String[] args) 
	{
		InfiniteChances.help();
	}
}
