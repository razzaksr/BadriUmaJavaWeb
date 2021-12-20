package learn.console.BadriJava;

import java.util.Scanner;

public class ControlState 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double time=0.0;int fare=0;
		
		System.out.println("Tell us destination: ");
		String dest=scan.next();
		switch(dest)
		{
		case "chennai":case "Chennai":case "CHENNAI":case "vellore":case "dharmapuri":
			System.out.println("Destination of "+dest+" has sleeper,ac,seater available choose timing: ");
			time=scan.nextDouble();
			if(time>=6.00&&time<=10.00)
			{
				System.out.println("A/C Seater available");
			}
			else if(time>=10.01&&time<=12.00)
			{
				System.out.println("Semi Sleeper available");
			}
			else if(time>=12.01&&time<=15.00)
			{
				System.out.println("A/C Sleeper, Seater available");
				System.out.println("Tell us amount to book seats: ");
				fare=scan.nextInt();
				switch(fare)
				{
				case 350:System.out.println("Seater available to "+dest+" in "+time);break;
				case 750:System.out.println("Sleeper available to "+dest+" in "+time);break;
				default:System.out.println(fare+" not match in "+time+" to "+dest);
				}
			}
			else
			{
				System.out.println("No coaches available "+time+" to "+dest);
			}
			break;
		case "banglore":System.out.println("A/C seater available @ afternoon timings to "+dest);break;
		case "cochin":System.out.println("A/C Seater, Sleeper and Delux coaches available @ evenings to "+ dest);break;
		case "hyderabad":System.out.println("Seater and Sleeper available @ night timings to "+dest);break;
		default:System.out.println("No coaches available to "+dest);
		}
		
		scan.close();
	}
}
