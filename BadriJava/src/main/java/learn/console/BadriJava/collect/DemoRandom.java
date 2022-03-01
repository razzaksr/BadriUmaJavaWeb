package learn.console.BadriJava.collect;

import java.util.Random;

public class DemoRandom 
{
	public static void main(String[] args) 
	{
		Random ran=new Random();
		//System.out.println(ran.nextDouble());
		
		//System.out.println(ran.nextInt(10000));
		
		String otp="";
		
		for(int times=1;times<=8;times++)
		{
			otp+=ran.nextInt(10);
		}
		System.out.println("OTP: "+otp);
	}
}
