package learn.console.BadriJava.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountRepeat 
{
	public static void count(Integer[] alpha)
	{
		ArrayList<Integer> i = new ArrayList<Integer>();
		i=(ArrayList<Integer>) Arrays.asList(alpha);
		
	}
	public static void main(String[] args) 
	{
		CountRepeat.count(new Integer[] {4,5,3,5,3,9});
	}
}
