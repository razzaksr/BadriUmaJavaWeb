package learn.console.BadriJava.handle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Simple 
{
	public static double findMax(Double[] yet)
	{
		List<Double> t = Arrays.asList(yet);
		return Collections.max(t);
	}
	public static void main(String[] args) 
	{
		Double[] hai= {1.3,6.7,8.9,12.5,0.9,1.6,7.8,3.5};
		System.out.println(Simple.findMax(hai));
	}
}
