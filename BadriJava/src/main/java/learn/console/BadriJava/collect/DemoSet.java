package learn.console.BadriJava.collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/*
 * HashSet: random order
 * TreeSet: ascending
 * 
 * add
 * 
 * remove(obj)
 * 
 * retainAll
 * removeAll
 * 
 * contains
 * 
 */

public class DemoSet 
{
	public static void main(String[] args) 
	{
		ArrayList<Double> list1=new ArrayList<Double>();
		
		list1.add(8.9);list1.add(2.3);list1.add(8.9);list1.add(1.4);list1.add(3.3);
		list1.add(9.1);list1.add(1.1);list1.add(4.5);list1.add(1,12.4);list1.add(8.9);
		
		System.out.println("ArrayList:\n"+list1);
		
		HashSet set1=new HashSet();
		set1.addAll(list1);
		
		System.out.println("HAsh:\n"+set1);
		
		TreeSet set2=new TreeSet();
		set2.addAll(list1);
		
		System.out.println("Tree:\n"+set2);
		
		set2.remove(8.9);
		set1.remove(2.3);
		
		System.out.println(set1.contains(8.9));
		System.out.println(set2.contains(2.3));
		
		System.out.println("HAsh:\n"+set1);
		System.out.println("Tree:\n"+set2);
		
	}
}
