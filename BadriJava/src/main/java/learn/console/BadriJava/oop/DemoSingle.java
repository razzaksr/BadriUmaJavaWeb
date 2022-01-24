package learn.console.BadriJava.oop;

import java.util.Arrays;

public class DemoSingle 
{
	public static void main(String[] args) 
	{
		MyProcess process=new MyProcess();
		process.show();
		System.out.println(process.binarySearch(0, process.yet.length-1, "Ruffalo",process.yet));
		System.out.println(process.binarySearch(0, process.yet.length-1, "Scarlet",process.yet));
		System.out.println(process.binarySearch(0, process.yet.length-1, "Evans",process.yet));
		System.out.println(process.binarySearch(0, process.yet.length-1, "Zendaya",process.yet));
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
	public int binarySearch(int start,int end,String data,String[] arr)
	{
		if(end>=start)
		{
			int mid=(end+start)/2;
			if(arr[mid].compareTo(data)==0)
				return mid;
			else if(arr[mid].compareTo(data)>0)
				return binarySearch(start, mid, data,arr);
			else
				return binarySearch(mid+1, end, data,arr);
		}
		else
			return -1;
	}
}