package learn.console.BadriJava;

import java.util.Scanner;

public class Keys 
{
	public static void main(String[] args) 
	{
		int amt=0;
		Scanner scan=new Scanner(System.in);
		
		for(int seats=1;seats<=20;)
		{
			if(seats%2==0||seats%3==0) {
				System.out.println("Booked already");
				seats++;
				break;//continue;
			}
			else
			{
				System.out.println("Enter the amount: ");
				amt=scan.nextInt();
				if(amt>=530)
				{
					System.out.println(seats+" Seat Booked");
					seats++;
				}
				else {
					System.out.println("Insufficient amount to book");
				}
			}
		}
		
		scan.close();
	}
}
