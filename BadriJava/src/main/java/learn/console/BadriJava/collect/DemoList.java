package learn.console.BadriJava.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

/*
 * ArrayList: Not a thread safe(asynchronous)
 * Vector	: Thread safe (synchronous)
 * 
 * add
 * add(pos,obj)
 * addAll
 * 
 * set(pos,obj)
 * 
 * remove(obj)
 * 
 * remove(pos)
 * 
 * get(pos)
 * 
 * removeAll
 * retainAll
 * 
 * Collections:
 * sort
 * max
 * min
 * reverse
 * replaceAll
 */

public class DemoList 
{
	public static void main(String[] args) 
	{
		ArrayList<Double> list1=new ArrayList<Double>();
		
		list1.add(8.9);list1.add(2.3);list1.add(8.9);list1.add(1.4);list1.add(3.3);
		list1.add(9.1);list1.add(1.1);list1.add(4.5);list1.add(1,12.4);list1.add(8.9);
		
		System.out.println("ArrayList:\n"+list1);
		
		Vector<Double> list2=new Vector<Double>();
		list2.addAll(list1);
		
		System.out.println("Vector:\n"+list2);
		
		list1.set(4, 12.76);
		list2.remove(9.1);
		
		System.out.println("ArrayList:\n"+list1);
		System.out.println("Vector:\n"+list2);
		
		System.out.println(list2.get(4));
	
		//Collections:
		Collections.sort(list1);
		System.out.println("ArrayList:\n"+list1);
		Collections.reverse(list2);
		System.out.println("Vector:\n"+list2);
		System.out.println(Collections.min(list1));
		System.out.println(Collections.max(list1));
		Collections.replaceAll(list1, 8.9, 76.1);
		Collections.replaceAll(list2, 8.9, 0.1);
		
		System.out.println("ArrayList:\n"+list1);
		System.out.println("Vector:\n"+list2);
		
		list1.retainAll(list2);
		
		System.out.println("ArrayList:\n"+list1);
		System.out.println("Vector:\n"+list2);
		
		list2.removeAll(list1);
		
		System.out.println("ArrayList:\n"+list1);
		System.out.println("Vector:\n"+list2);
	}
}
