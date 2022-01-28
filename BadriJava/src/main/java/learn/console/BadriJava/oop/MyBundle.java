package learn.console.BadriJava.oop;

import java.util.Arrays;

public class MyBundle 
{
	private double[] hai= {1.2,5.7,9.2,4.1,6.3,0.9,5.6,89.3,65.4,12.9,3.4,1.1,17.4};
	public void list()
	{
		System.out.println(Arrays.toString(hai));
	}
	int linear(double users)
	{
		for(int index=0;index<hai.length;index++)
		{
			if(hai[index]==users)
				return index;
		}
		return -1;
	}
	protected double[] split(int start,int end)
	{
		if(end>start&&end<hai.length-1)
		{
			return Arrays.copyOfRange(hai, start, end);
		}
		else
		{
			return new double[0];// empty array
		}
	}
	public final void sort()
	{
		System.out.println("Sorting about to happen");
		Arrays.sort(hai);
		System.out.println("Sorting has done");
	}
}
