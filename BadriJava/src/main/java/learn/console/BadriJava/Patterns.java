package learn.console.BadriJava;

import java.util.Scanner;

public class Patterns 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		char data='A';
		
		System.out.println("Tell us no of rows: ");
		int range=scan.nextInt();// row count
		
		
		// perfect square
		for(int row=1;row<=range;row++)
		{
			for(int col=1;col<=range;col++,data++)
			{
				System.out.print(data);
			}
			System.out.println();
		}
		
		data='A';
		// left upper floyd
		for(int row=1;row<=range;row++)
		{
			for(int col=1;col<=row;col++,data++)
			{
				System.out.print(data);
			}
			System.out.println();
		}
		
		data='A';
		// left lower floyd
		for(int row=range;row>0;row--)
		{
			for(int col=1;col<=row;col++,data++)
			{
				System.out.print(data);
			}
			System.out.println();
		}
		
		data='A';
		// right upper floyd
		for(int row=1;row<=range;row++)
		{
			for(int space=range-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++,data++)
			{
				System.out.print(data);
			}
			System.out.println();
		}
		
		data='A';
		// right lower floyd
		for(int row=range;row>0;row--)
		{
			for(int space=range-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++,data++)
			{
				System.out.print(data);
			}
			System.out.println();
		}
		
		
		// pascal triangle upper
		data='A';
		// right upper floyd
		for(int row=1;row<=range;row++)
		{
			for(int space=range-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++,data++)
			{
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
		
		data='A';
		// right lower floyd
		for(int row=range;row>0;row--)
		{
			for(int space=range-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++,data++)
			{
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
		data='A';int limit=1;
		// pyramid upper
		for(int row=1;row<=range;row++)
		{
			for(int space=range-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=limit;col++,data++)
			{
				System.out.print(data);
			}
			System.out.println();limit+=2;
		}
		
		data='A';limit=(range*2)-1;
		// pyramid lower
		for(int row=range;row>0;row--)
		{
			for(int space=range-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=limit;col++,data++)
			{
				System.out.print(data);
			}
			System.out.println();limit-=2;
		}
		
		scan.close();
	}
}
