package learn.console.BadriJava.concurrent;

import java.util.Arrays;

public class Why 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Sigma s=new Sigma();
		Thread t1=new Thread(s,"Robert");
		Thread t2=new Thread(s,"Magnam");
		Thread t3=new Thread(s,"Pratt");
		Thread t4=new Thread(s,"React");
		Thread t5=new Thread(s,"Western");
		t1.start();t1.join();
		t2.start();t2.join();
		t3.start();t3.join();
		t4.start();t4.join();
		t5.start();
	}
}

// resource class
class Sigma extends Thread
{
	private char[] make= {'J','H','O','N','Y',' ','D','E','P','P'};
	public void list()
	{
		System.out.println(Arrays.toString(make));
	}
	public void run()
	{
		System.out.print("Entered "+Thread.currentThread().getName());
		System.out.print(" its priority is "+Thread.currentThread().getPriority());
		System.out.println(" id is "+Thread.currentThread().getId());
		list();
	}
}