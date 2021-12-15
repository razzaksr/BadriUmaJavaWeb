package learn.console.BadriJava;

/*
 * Parsing: String to other types with the help of wrapper class parse method
 * Wrapper.parseType(String)
 */

public class Parsing 
{
	public static void main(String[] args) 
	{
		String data="IQOO Z3";
		System.out.println("Mobile model "+data);
		data="8";
		//char hai=data.charAt(0);
		//System.out.println("RAM GB is "+hai);
		int ram=Integer.parseInt(data);
		System.out.println("RAM GB is: "+(ram+2));
		data="6.3";
		double displaySize=Double.parseDouble(data);
		//System.out.println("Screen display size is: "+displaySize);
		System.out.printf("Screen display size is: %.2f",displaySize);
	}
}
