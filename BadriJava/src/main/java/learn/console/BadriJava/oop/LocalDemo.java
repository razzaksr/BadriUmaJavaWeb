package learn.console.BadriJava.oop;

import java.util.Arrays;

public class LocalDemo 
{
	public static void main(String[] args) 
	{
		Packet pack=new Packet();
		pack.list();
		pack.check(7.2);
		pack.list();
		pack.bind("selection");
		pack.bind("basic");
	}
}


class Packet
{
	private double[] salaries= {4.5,9.2,12.5,7.2,5.4,3.2,9.7,6.5};
	public void list()
	{
		System.out.println(Arrays.toString(salaries));
	}
	// find element and update it by 10 via array data
	public void check(double element)
	{
		for(int index=0;index<salaries.length;index++)
		{
			if(element==salaries[index])
			{
				//element+=10;
				salaries[index]+=10;
				System.out.println("Data updated");
			}
		}
		//System.out.println(index);
	}
	public void bind(String choice)
	{
		// local member class
		class Order
		{
			public void basicSort()
			{
				Arrays.sort(salaries);
				System.out.println("Listing elements after basic sort");
				list();
			}
			public void bubbleSort()
			{
				for(int outer=0;outer<salaries.length-1;outer++)
				{
					for(int nested=0;nested<salaries.length-outer-1;nested++)
					{
						if(salaries[nested]>salaries[nested+1])
						{
							salaries[nested]+=salaries[nested+1];
							salaries[nested+1]=salaries[nested]-salaries[nested+1];
							salaries[nested]-=salaries[nested+1];
						}
					}
				}
				System.out.println("Listing elements after bubble sort");
				list();
			}
		}
		
		Order order=new Order();
		switch(choice)
		{
		case "basic":order.basicSort();break;
		case "bubble":order.bubbleSort();break;
		default:
			System.out.println("No Sorting gonna happen");
			list();
		}	
	}
}