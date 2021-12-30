package learn.console.BadriJava.array;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion 
{
	public static void main(String[] args) 
	{
		Source src=new Source();
		src.addSource("Logapriyan");src.addSource("Badri");
		src.addSource("Aarthi");src.addSource("Umadevi");
		src.addSource("Venkat");src.addSource("MAnoj");
		src.addSource("Sarathy");
		
		//src.list();
		
		//System.out.println(src.update("Umadevi"));
		
		//System.out.println(src.update(1,"Rajiya"));
		
		//System.out.println(src.getAt(4));
		System.out.println(src.deleteAt(7));
		src.list();
	}
}


class Source
{
	private Scanner scan=new Scanner(System.in);
	static {System.out.println("Source static");}
	private String[] myResources=new String[10];
	public Source()
	{
		System.out.println("Contructed called to initialize ");
		myResources[0]="Mohamed";myResources[1]="Rasheedha";
		myResources[2]="Razak";myResources[3]="Sabari";myResources[4]="Sheik";
		myResources[5]="Dinesh";
	}
	
	public static String[] join(String[] a,String[] b)
	{
		String[] total=new String[a.length+b.length];
		for(int index=0;index<total.length;index++)
		{
			if(index<a.length)
				total[index]=a[index];
			else
				total[index]=b[index];
		}
		return total;
	}
	
	public String deleteAt(int index)
	{
		if(index<myResources.length)
		{
			String data=myResources[index];
			myResources[index]=null;
			
//			myResources[index]=null;
//			String tmp1[]=Arrays.copyOfRange(myResources, 0, index-1);
//			String[] tmp2=Arrays.copyOfRange(myResources, index+1,myResources.length);
//			
//			myResources=join(tmp1, tmp2);
			
			return data+" has deleted";
		}
		else
			return index+" is invalid"; 
	}
	public String getAt(int index)
	{
		if(index<myResources.length)
			return myResources[index]+" has found @ "+index;
		else
			return index+" is invalid";
	}
	public void addSource(String name)
	{
		for(int index=0;index<myResources.length;index++)
		{
			if(myResources[index]==null)
			{
				myResources[index]=name;
				System.out.println(name+" has recruited for our Zealous");
				return;
			}
		}
		System.out.println("Do you wish to replace some one by "+name+" as true/false");
		boolean confirm=scan.nextBoolean();
		if(confirm)
		{
			System.out.println("Tell whom you wish to replace: ");
			list();
			String whom=scan.next();
			System.out.println(update(whom,name));
			return;
		}
		System.out.println(name+" hasn't recruited since we have enough resources");
	}
	public void list()
	{
		System.out.println("Listing all resources");
		for(String third:myResources)
		{
			System.out.println(third);
		}
	}
	public String update(String old,String current)
	{
		for(int index=0;index<myResources.length;index++)
		{
			if(myResources[index].equals(old))
			{
				myResources[index]=current;
				return old+" has replaced @ "+index+" by "+myResources[index]+" for our Zealous"; 
			}
		}
		return old+" hasn't match any of our resources";
	}
	public String update(String object)
	{
		for(int index=0;index<myResources.length;index++)
		{
			if(myResources[index].equals(object))
			{
				System.out.println("Tell us new reosurce @ "+index+" instead of "+object);
				myResources[index]=scan.next();
				return object+" has replaced @ "+index+" by "+myResources[index]+" for our Zealous"; 
			}
		}
		return object+" hasn't match any of our resources";
	}
	public String update(int pos,String current)
	{
		if(pos<myResources.length)
		{
			myResources[pos]=current;
			return current+" has replacement @ "+pos;
		}
		return pos+" position is invalid";
	}
}