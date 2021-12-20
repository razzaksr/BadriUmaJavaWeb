package learn.console.BadriJava;

import java.util.Scanner;

public class Interview 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String tech="";
		
		System.out.println("----------------------------Cognizant-------------------------");
		int expected=10;
		while(expected>0)
		{
			System.out.println("Tell us what technology you knew: ");
			tech=scan.next();
			switch(tech)
			{
			case "java":case "spring": case "hibernate":case "jpa":System.out.println(tech+" web developer role available so we recruite you");
			expected--;
																	break;
			case "python":System.out.println("Python testing role available, we recruite you");
			expected--;break;
			default:System.out.println("we don't have any roles for "+tech);
			}
			
		}
		
		scan.close();
	}
}
