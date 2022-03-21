package learn.console.BadriJava.concurrent;

import java.util.Scanner;

public class InterCommunication 
{
	public static void main(String[] args) 
	{
		GM m=new GM();
		CDM c=new CDM(m);
		Thread t1=new Thread(m,"Kumaran");
		Thread t2=new Thread(c,"Uma");
		t1.start();t2.start();
	}
}

class CDM implements Runnable
{
	int deposited=20000;
	
	GM g;
	public CDM(GM obj)
	{
		g=obj;
	}
	
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName()+" came to deposit 10k");
		
		synchronized (g.scan) 
		{
			if(g.available<g.req)
			{
				g.available+=g.req;
				System.out.println(Thread.currentThread().getName()+" deposited "+g.req);
				g.scan.notify();
			}
			else
			{
				deposited+=10000;
				System.out.println(Thread.currentThread().getName()+" deposited 10k");
				System.out.println("Thanks for visiting CDM");
			}
		}
		
		
	}	
}

class GM implements Runnable
{
	int available=10000;
	Scanner scan=new Scanner(System.in);
	int req=0;
	@Override
	public void run() 
	{
		synchronized (scan) {
			System.out.println("Tell us amount to withdraw: ");
			req=scan.nextInt();
			if(req>available)
			{
				try {
					scan.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			available-=req;
			System.out.println(Thread.currentThread().getName()+" withdrawn "+req+" successfully");
		}
	}
}