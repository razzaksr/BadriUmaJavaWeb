package learn.console.BadriJava.oop;

import java.util.Arrays;

public class DemoOverriding implements Cosmo
{
	public static void main(String[] args) 
	{
		Beta beta=new Beta();
		beta.traverse();
		beta.finale(4, 10);
		
		DemoOverriding demo=new DemoOverriding();
		System.out.println(demo.hello[0]);
		demo.hello[0]+=2;
		System.out.println(demo.hello[0]);
		//demo.only+=10;
		demo.angular();
	}

	@Override
	public void angular() {
		// TODO Auto-generated method stub
		System.out.println("JS Front end framework");
	}
}

interface Cosmo
{
	double[] hello= {4.5,6.7,9.1,34.5,1.2,4.6,9.2,12.5};
	double only=89.1;
	public void angular();// abstract method/ without body/definition
	//{
		//System.out.println("JS Front end framework");
	//}
}

class Alpha
{
	int[] term= {23,56,78,1,12,2,98,44,5,77,244,988,67,44,67,98,343,998,124,56};
	public void traverse() // non abstract method/ method with definition/ body
	{
		System.out.println("Listing all values in array: ");
		System.out.println(Arrays.toString(term));
	}
}

class Beta extends Alpha
{
	public void traverse()//overriding
	{
		System.out.println("Beta Traverse: ");
		for(int index=term.length-1;index>=0;index--)
		{
			System.out.print(term[index]+" ");
		}
		System.out.println();
		super.traverse();
	}
	public void finale(int start,int end)
	{
		System.out.println("Listing values of array from "+start+" and "+end);
		System.out.println(Arrays.toString(Arrays.copyOfRange(term, start, end)));
		
	}
}