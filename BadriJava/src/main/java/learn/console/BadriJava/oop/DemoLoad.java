package learn.console.BadriJava.oop;

public class DemoLoad 
{
	public static void main(String[] args) 
	{
		Energy en=new Energy();
		en.extract();
		en.extract(5.0);
		en.extract(15);
		en.extract(3.0, 5);
		en.extract(10, 8.0);
	}
}

class Energy
{
	private double[] find= {7.8,4.5,9.7,2.4,7.6,23.3,6.7,4.56,8.23,2.5,6.2,6.8,3.6,9.5,2.4,1.1,7.8};
	public void extract()
	{
		System.out.println("Listing all");
		for(double tmp:find)
		{
			System.out.print(tmp+" ");
		}
		System.out.println();
	}
	public void extract(int end)
	{
		System.out.println("Searching all between 0 and "+end);
		if(end<find.length)
		{
			for(int index=0;index<end;index++)
			{
				System.out.print(find[index]+" ");
			}
		}
		else
		{
			System.out.println("Invalid end limit");
		}
		System.out.println();
	}
	public void extract(double max)
	{
		System.out.println("Searching values less than "+max);
		for(int index=0;index<find.length;index++)
		{
			if(find[index]<=max)
				System.out.print(find[index]+" ");
		}
		System.out.println();
	}
	public void extract(int pos,double min)
	{
		System.out.println("Searching from "+pos+" for finding values greater than "+min);
		if(pos<find.length&&pos>=0)
		{
			for(int index=pos;index<find.length;index++)
			{
				if(find[index]>=min)
					System.out.print(find[index]+" ");
			}
			System.out.println();
		}
		else {
			System.out.println("Invlaid start position");
		}
	}
	public void extract(double min,int pos)
	{
		System.out.println("Searching between 0 and "+pos+" for finding values greater than "+min);
		if(pos<find.length)
		{
			for(int index=0;index<pos;index++)
			{
				if(find[index]>=min)
					System.out.print(find[index]+" ");
			}
			System.out.println();
		}
		else {
			System.out.println("Invlaid end position");
		}
	}
}