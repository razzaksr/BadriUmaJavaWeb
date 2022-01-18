package learn.console.BadriJava.oop;

import java.util.Arrays;

/*
 * object memory created once, and reuse the same memory in order to call multiple member's same class
 * 
 * anonymous:
 * without object calling class member even though member is non static
 * memory allocated every time/call newly
 *  
 */

public class AnonymousDemo 
{
	public static void main(String[] args) 
	{
		// object: re-usability
		Strict st=new Strict();
		st.traverse();
		st.convert();
		st.traverseColony();
		st.filter("d");
		
		// anonymous way
		new Strict().traverseColony();
		new Strict().filter("i");
	}
}

class Strict
{
	private static String[][] crew= {{"Razak","Sabari"},{"Rasheedha","Mohamed","Rajiya"},{"Vinod","Prakash","Akram","Vikas"}};
	private static String[] colony=new String[10];
	public void convert()
	{
		for(int row=0, index=0;row<crew.length;row++)
		{
			for(int col=0;col<crew[row].length;col++,index++)
			{
				colony[index]=crew[row][col];
			}
		}
	}
	public void traverse()
	{
		for(String[] row:crew)
		{
			for(String person:row)
			{
				System.out.print(person+" ");
			}
			System.out.println();
		}
	}
	public void traverseColony()
	{
		System.out.println(Arrays.toString(colony));
	}
	public void filter(String phrase)
	{
		for(int index=0;index<colony.length&&colony[index]!=null;index++)
		{
			if(colony[index].endsWith(phrase))
				System.out.println(colony[index]);
		}
	}
}