package learn.console.BadriJava.oop;

/*
 * 
 * Members:
 * a. Class members: under class scope
 * 	1. static members>> Call via ClassName.members
 * 	2. non static members>> Instance/ object has to be created
 * b. Local members: under any block such as method or any loops or any nested blocks
 * 	
 */

import java.util.Arrays;

import learn.console.BadriJava.oop.House.Portion;

public class NonStaticDemo 
{
	public static void main(String[] args) 
	{
		House.traverse();
		House house=new House();
		Portion portion=house.new Portion();
		portion.convert();
		portion.traverse();
	}
}

class House
{
	private static String[][] crew= {{"Razak","Sabari"},{"Rasheedha","Mohamed","Rajiya"},{"Vinod","Prakash","Akram","Vikas"}};
	public static void traverse()
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
	class Portion
	{
		private String[] colony=new String[10];
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
			System.out.println(Arrays.toString(colony));
		}
	}
}