package learn.console.BadriJava.oop;

import java.util.Arrays;

public class StaticDemo 
{
	public static void main(String[] args) 
	{
		Alphabet.hiFy(2);
		Alphabet.Numeric.update(6000);
		Alphabet.Numeric num=new Alphabet.Numeric();
		num.traverse();
	}
}

class Alphabet
{
	private static Integer[][] apart= {{8700,1300},{9100,10900,3400,5100},{2100,4000,3100}};
	public static void hiFy(int row)
	{
		if(row<apart.length)
		{
			System.out.println(Arrays.toString(apart[row]));
		}
		else {
			System.out.println("Invalid row "+row);
		}
	}
	static class Numeric
	{
		public void traverse()
		{
			for(Integer[] row:apart)
			{
				System.out.println(Arrays.toString(row));
			}
		}
		public static void update(int max)
		{
			for(int row=0;row<apart.length;row++)
			{
				for(int col=0;col<apart[row].length;col++)
				{
					if(apart[row][col]>=max)
						apart[row][col]-=(int)(apart[row][col]*0.500);
				}
			}
		}
	}
}