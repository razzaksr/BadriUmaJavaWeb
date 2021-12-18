package learn.console.BadriJava;

import java.util.Scanner;

public class Decisions 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int count2000s=5,count500s=10,count200s=30,count100s=50;int reqCount=0;
		String rec="";
		
		System.out.println("----------------welcome to axis bank----------------------");
		System.out.println("Tell us amount to withdraw: ");
		int cash=scan.nextInt();
		
		int total=(count2000s*2000)+(count500s*500)+(count200s*200)+(count100s*100);
		
		if(total>=cash)
		{
			if(cash/2000!=0 && count2000s>0)
			{
				reqCount=cash/2000;
				if(reqCount>count2000s)
				{
					cash-=(count2000s*2000);
					rec+="2000 X "+count2000s+"\n";
					count2000s=0;
				}
				else
				{
					cash-=(reqCount*2000);
					rec+="2000 X "+reqCount+"\n";
					count2000s-=reqCount;
				}
			}
			if(cash>0 && cash/500!=0 && count500s>0)
			{
				reqCount=cash/500;
				if(reqCount>count500s)
				{
					cash-=(count500s*500);
					rec+="500 X "+count500s+"\n";
					count500s=0;
				}
				else
				{
					cash-=(reqCount*500);
					rec+="500 X "+reqCount+"\n";
					count500s-=reqCount;
				}
			}
			if(cash>0 && cash/200!=0 && count200s>0)
			{
				reqCount=cash/200;
				if(reqCount>count200s)
				{
					cash-=(count200s*200);
					rec+="200 X "+count200s+"\n";
					count200s=0;
				}
				else
				{
					cash-=(reqCount*200);
					rec+="200 X "+reqCount+"\n";
					count200s-=reqCount;
				}
			}
			if(cash>0 && cash/100!=0 && count100s>0)
			{
				reqCount=cash/100;
				if(reqCount>count100s)
				{
					cash-=(count100s*100);
					rec+="100 X "+count100s+"\n";
					count100s=0;
				}
				else
				{
					cash-=(reqCount*100);
					rec+="100 X "+reqCount+"\n";
					count100s-=reqCount;
				}
			}
			System.out.println("Amount dispensed:\n"+rec);
		}
		else
		{
			System.out.println(cash+" amount cannot dispensed");
		}
		
				
		scan.close();
	}
}
