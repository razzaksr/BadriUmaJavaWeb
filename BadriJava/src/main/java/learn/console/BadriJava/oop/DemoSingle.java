package learn.console.BadriJava.oop;

import java.util.Arrays;

public class DemoSingle 
{
	public static void main(String[] args) 
	{
		MyProcess process=new MyProcess();
		process.show();
		System.out.println(process.binarySearch(0, process.yet.length-1, "Ruffalo"));
		System.out.println(process.binarySearch(0, process.yet.length-1, "Scarlet"));
		System.out.println(process.binarySearch(0, process.yet.length-1, "Evans"));
		System.out.println(process.binarySearch(0, process.yet.length-1, "Zendaya"));
	}
}

class MyPack
{
	String[] yet= {"Downey","Evans","Garfield","Hemsworth","Hiddleston","Holland","Jackman","Pratt","Ruffalo","Scarlet","Tobey"};
	public void show()
	{
		System.out.println(Arrays.toString(yet));
	}
}

class MyProcess extends MyPack
{
	public int binarySearch(int start,int end,String data)
	{
		if(end>=start)
		{
			int mid=(end+start)/2;
			if(yet[mid].compareTo(data)==0)
				return mid;
			else if(yet[mid].compareTo(data)>0)
				return binarySearch(start, mid, data);
			else
				return binarySearch(mid+1, end, data);
		}
		else
			return -1;
	}
}