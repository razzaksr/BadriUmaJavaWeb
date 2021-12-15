package learn.console.BadriJava;

public class CommandLineArgument 
{
	public static void main(String[] uma) 
	{
		System.out.println(uma.length);
		int fuel=0, kms=0;
		fuel=Integer.parseInt(uma[0]);
		kms=Integer.parseInt(uma[1]);
		
		System.out.println((float)fuel/kms);
	}
}
