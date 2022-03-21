package learn.console.BadriJava.concurrent;

import java.util.Scanner;

public class Life 
{
	public static void main(String[] args) 
	{
		Fiend win=new Fiend();
		Thread t1=new Thread(win,"Kumaran");
		Thread t2=new Thread(win,"Manoj");
		Thread t3=new Thread(win,"Uma");
		Thread t4=new Thread(win,"Badri");
		t1.start();t2.start();t3.start();t4.start();
	}
}

class Fiend implements Runnable
{
	int atm=50000;
	Scanner scan=new Scanner(System.in);
	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		System.out.println("Welcome "+Thread.currentThread().getName()+" to our ATM facility");
		int required=scan.nextInt();
		if(required<=atm)
		{
			System.out.println(Thread.currentThread().getName()+" about to withdraw "+required);
			if(required>=4000)
			{
				try {
					Thread.currentThread().sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			atm-=required;
			System.out.println(required+" amount by "+Thread.currentThread().getName()+" debited");
		}
		else
		{
			Thread.currentThread().stop();
		}
		System.out.println("Thanks for contacting our ATM "+Thread.currentThread().getName());
	}
	
	
}