package learn.console.BadriJava;

import java.util.Arrays;

import learn.console.BadriJava.oop.MyBundle;

public class DemoBundle extends MyBundle
{
	public static void main(String[] args) 
	{
		DemoBundle bundle=new DemoBundle();
		bundle.sort();// public final
		bundle.list();//public
		//System.out.println(bundle.linear(1.1));// default
		double[] yet=bundle.split(5, 10);// protected
		System.out.println(Arrays.toString(yet));
	}
}
