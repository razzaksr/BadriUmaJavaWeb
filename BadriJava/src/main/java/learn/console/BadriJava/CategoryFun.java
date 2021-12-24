package learn.console.BadriJava;

import java.util.Scanner;

public class CategoryFun 
{
	public static void main(String[] args) 
	{
		//FunOutThere.hey();// 
		FunOutThere.debit();
	}
}

class FunOutThere
{
	// no return and no param
	static int check=1;
	public static void hey()
	{
		// do while
		/*System.out.println("Hey Out there! just hang on");
		if(check<=10)
		{
			check++;
			FunOutThere.hey();// recursive/ repeat
		}*/
		// while/for
		if(check<=10)
		{
			System.out.println("Hey Out there! just hang on");
			check++;
			FunOutThere.hey();// recursive/ repeat
		}
	}
	
	static Scanner scan=new Scanner(System.in);
	private static int count2000s=5,count500s=10,count200s=30,count100s=50,reqCount=0;
	public static void debit()
	{
		String rec="";
		int dcount2000s=count2000s,dcount500s=count500s,dcount200s=count200s,dcount100s=count100s;
		System.out.println("----------------welcome to axis bank----------------------");
		System.out.println("Tell us amount to withdraw: ");
		int cash=scan.nextInt();
		
		int total=(count2000s*2000)+(count500s*500)+(count200s*200)+(count100s*100);
		
		if(total>0)
		{
			if(total>=cash)
			{
				if(cash/2000!=0 && dcount2000s>0)
				{
					reqCount=cash/2000;
					if(reqCount>dcount2000s)
					{
						cash-=(dcount2000s*2000);
						rec+="2000 X "+dcount2000s+"\n";
						dcount2000s=0;
					}
					else
					{
						cash-=(reqCount*2000);
						rec+="2000 X "+reqCount+"\n";
						dcount2000s-=reqCount;
					}
				}
				if(cash>0 && cash/500!=0 && dcount500s>0)
				{
					reqCount=cash/500;
					if(reqCount>dcount500s)
					{
						cash-=(dcount500s*500);
						rec+="500 X "+dcount500s+"\n";
						dcount500s=0;
					}
					else
					{
						cash-=(reqCount*500);
						rec+="500 X "+reqCount+"\n";
						dcount500s-=reqCount;
					}
				}
				if(cash>0 && cash/200!=0 && dcount200s>0)
				{
					reqCount=cash/200;
					if(reqCount>dcount200s)
					{
						cash-=(dcount200s*200);
						rec+="200 X "+dcount200s+"\n";
						dcount200s=0;
					}
					else
					{
						cash-=(reqCount*200);
						rec+="200 X "+reqCount+"\n";
						dcount200s-=reqCount;
					}
				}
				if(cash>0 && cash/100!=0 && dcount100s>0)
				{
					reqCount=cash/100;
					if(reqCount>dcount100s)
					{
						cash-=(dcount100s*100);
						rec+="100 X "+dcount100s+"\n";
						dcount100s=0;
					}
					else
					{
						cash-=(reqCount*100);
						rec+="100 X "+reqCount+"\n";
						dcount100s-=reqCount;
					}
				}
				if(cash==0) {
					System.out.println("Amount dispensed:\n"+rec);
					count2000s=dcount2000s;count500s=dcount500s;count200s=dcount200s;count100s=dcount100s;//iter
				}
				else {
					System.out.println("amount cannot be dispensed due to invalid amount");
				}
			}
			else
			{
				System.out.println(cash+" amount cannot be dispensed due to required amount is high");
			}
			FunOutThere.debit();// recursive
		}
		else
		{
			System.out.println("Cash not available");
		}
	}
}