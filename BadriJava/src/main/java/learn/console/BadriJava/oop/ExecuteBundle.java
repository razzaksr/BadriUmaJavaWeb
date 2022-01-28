package learn.console.BadriJava.oop;

import java.util.Arrays;

public class ExecuteBundle 
{
	public static void main(String[] args) 
	{
		MyBundle bundle=new MyBundle();
		//bundle.hai
		bundle.list();// public
		double[] yet=bundle.split(5, 10);// protected
		System.out.println(Arrays.toString(yet));
		System.out.println(bundle.linear(1.1));// default
		bundle.sort();// final
	}
}
