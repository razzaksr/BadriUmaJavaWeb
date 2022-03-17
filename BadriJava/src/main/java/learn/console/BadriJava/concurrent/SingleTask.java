package learn.console.BadriJava.concurrent;

import java.util.Scanner;

public class SingleTask 
{
	public static void main(String[] args) 
	{
		Search s=new Search();
		Thread t1=new Thread(s,"Robert");
		Thread t2=new Thread(s,"Magnam");
		Thread t3=new Thread(s,"Pratt");
		Thread t4=new Thread(s,"React");
		Thread t5=new Thread(s,"Western");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}

class Search implements Runnable
{
	private double[] check= {12.4,8.9,3.2,2.5,1.2,0.9,0.08};
	public int binary(int start,int end,double data)
	{
		if(end>=start)
		{
			int mid=(end+start)/2;
			if(check[mid]==data)
				return mid;
			else if(check[mid]>data)
				return binary(mid+1,end,data);
			else
				return binary(start,mid-1,data);
		}
		else
			return -1;
	}
	@Override
	synchronized public void run() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(Thread.currentThread().getName()+" Tell us data to search");
		double user=scan.nextDouble();
		System.out.println(binary(0, check.length-1, user)+" is the position what "+Thread.currentThread().getName()+" searched");
	}
}