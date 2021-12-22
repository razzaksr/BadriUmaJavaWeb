package learn.console.BadriJava;

import java.util.Scanner;

public class RealNested 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int fare=0,rows=0;String chart="";
		// Bus chart
		System.out.println("Tell us no of rows in the bus: ");
		rows=scan.nextInt();
		while(rows>0)
		{
			for(int seats=1;seats<=4;seats++)
			{
				System.out.println("Enter the amount: ");
				fare=scan.nextInt();
				if(fare>=450)
				{
					System.out.println("Ticket has booked @ "+seats+" of "+rows);
					chart+="$";
				}
				else
				{
					System.out.println("Insufficient amount");
					chart+="@";
				}
				if(seats==2)
					chart+=" ";
			}
			chart+="\n";
			rows--;
		}
		
		System.out.println("Chart of above booking process:\n"+chart);
		
		
		scan.close();
	}
}
