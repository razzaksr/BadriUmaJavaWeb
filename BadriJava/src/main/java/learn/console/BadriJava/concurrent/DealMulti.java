package learn.console.BadriJava.concurrent;

public class DealMulti 
{
	public static void main(String[] args) 
	{
		Sigma s=new Sigma();
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		Thread t3=new Thread(s);
		Thread t4=new Thread(s);
		Thread t5=new Thread(s);
		
		fifa f=new fifa();
		Thread t6=new Thread(f);
		Thread t7=new Thread(f);
		Thread t8=new Thread(f);
		Thread t9=new Thread(f);
		t1.start();t2.start();t3.start();t4.start();t5.start();
		t6.start();t7.start();t8.start();t9.start();
	}
}

class fifa implements Runnable
{
	private double[] check= {12.4,8.9,3.2,2.5,1.2,0.9,0.08};
	public int binary(int start,int end,double data)
	{
		if(end>start)
		{
			int mid=(end+start)/2;
			if(check[mid]==data)
				return mid;
			else if(check[mid]>data)
				return binary(mid+1,end,data);
			else
				return binary(start,mid,data);
		}
		else
			return -1;
	}
	@Override
	public void run() 
	{
		System.out.println(binary(0, check.length-1, 1.2));
	}
}