package learn.console.BadriJava.concurrent;

import java.util.Arrays;
import java.util.Scanner;

public class OneByOne 
{
	public static void main(String[] args) 
	{
		Winter win=new Winter();
		Thread t1=new Thread(win,"Kumaran");
		Thread t2=new Thread(win,"Manoj");
		Thread t3=new Thread(win,"Uma");
		Thread t4=new Thread(win,"Badri");
		t1.start();t2.start();t3.start();t4.start();
	}
}

class Winter implements Runnable
{
	int[] mark= {12,90,34,12,89,45,129,45,3,7,3,12,5,6,100};
	
	public void list()
	{
		System.out.println("Listing all by "+Thread.currentThread().getName());
		System.out.println(Arrays.toString(mark));
	}
	public void selection()
	{
		System.out.println("Selection by "+Thread.currentThread().getName());
		for(int select=0;select<mark.length;select++)
		{
			for(int com=select+1;com<mark.length;com++)
			{
				if(mark[select]>mark[com])
				{
					mark[select]*=mark[com];
					mark[com]=mark[select]/mark[com];
					mark[select]/=mark[com];
				}
			}
		}
	}
	public void bubble() 
	{
		System.out.println("Bubble by "+Thread.currentThread().getName());
		for(int times=0;times<mark.length-1;times++)
		{
			for(int bub=0;bub<mark.length-times-1;bub++)
			{
				if(mark[bub]<mark[bub+1])
				{
					mark[bub]+=mark[bub+1];
					mark[bub+1]=mark[bub]-mark[bub+1];
					mark[bub]-=mark[bub+1];
				}
			}
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome "+Thread.currentThread().getName());
		list();
		synchronized(this) 
		{
			System.out.println("Tell us which order you want: "+Thread.currentThread().getName());
			String order=scan.next();
			switch(order)
			{
			case "bubble":case "BUBBLE":bubble();break;
			case "selection":case "SELECTION":selection();break;
			default:System.out.println("Invalid sort by "+Thread.currentThread().getName());
			}
			list();
		}
	}
	
}