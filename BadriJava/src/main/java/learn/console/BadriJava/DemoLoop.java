package learn.console.BadriJava;

import java.util.Scanner;

public class DemoLoop
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us start and end to find prime numbers: ");
		int start=scan.nextInt();
		//int end=scan.nextInt();
		
		/*
		while(start<=end)
		{
			if(start==2||start==3||start==5||start==7||start%2!=0&&start%3!=0&&start%5!=0&&start%7!=0)
			{
				System.out.println(start+" is prime");
			}
			start++;
		}
		*/
		
		/*
		do
		{
			if(start==2||start==3||start==5||start==7||start%2!=0&&start%3!=0&&start%5!=0&&start%7!=0)
			{
				System.out.println(start+" is prime");
			}
			start++;
		}while(start<=end);
		*/
		
		/*
		for(;start<=end;start++)
		{
			if(start==2||start==3||start==5||start==7||start%2!=0&&start%3!=0&&start%5!=0&&start%7!=0)
			{
				System.out.println(start+" is prime");
			}
		}
		*/
		
		/*
		while(true)
		{
			if(start==2||start==3||start==5||start==7||start%2!=0&&start%3!=0&&start%5!=0&&start%7!=0)
			{
				System.out.println(start+" is prime");
			}
			start++;
			if(start==100)
				break;
		}
		*/
		
		for(;;start++)
		{
			if(start==2||start==3||start==5||start==7||start%2!=0&&start%3!=0&&start%5!=0&&start%7!=0)
			{
				System.out.println(start+" is prime");
			}
		}
		
		//scan.close();
	}
}
