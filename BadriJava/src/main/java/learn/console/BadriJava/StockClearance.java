package learn.console.BadriJava;

import java.util.Scanner;

public class StockClearance 
{
	public static void main(String[] args) 
	{
		int stock=0, required=0, pay=0, payable=0, invoices=0;float time=0.0F;
		Scanner scan=new Scanner(System.in);
		
		for(stock=75,time=12.01F;stock>0&&time<=12.59F;time+=0.01F)
		{
			System.out.println("Tell us how many mobile you wish: ");
			required=scan.nextInt();
			if(required<=stock)
			{
				payable=required*14999;
				System.out.println("Enter the amount: ");
				pay=scan.nextInt();
				if(pay>=payable) {
					System.out.println("Order placed for "+required+" iPhone 13 Pro");
					stock-=required;
					invoices++;
				}
				else {
					System.out.println("Order couldn't placed due to insufficient amount");
				}
			}
			else {
				System.out.println("We have only "+stock+" iPhones available");
			}
		}
		
		
		System.out.println("total invoices are: "+invoices+" still in stock "+stock);
		scan.close();
	}
}
