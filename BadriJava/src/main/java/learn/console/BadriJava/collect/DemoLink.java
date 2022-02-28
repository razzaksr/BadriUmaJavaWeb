package learn.console.BadriJava.collect;

import java.util.LinkedList;

/*
 * LinkedList: FiFo
 * add/ addLast
 * addFirst
 * add(pos,obj)
 * 
 * set(pos,obj)
 * 
 * remove/removeFirst
 * remove(pos)
 * removeLast
 * 
 * getLast
 * getFirst
 * get(pos)
 * 
 * indexOf(obj)
 * 
 * clear
 */

public class DemoLink 
{
	public static void main(String[] args) 
	{
		LinkedList link1=new LinkedList();
		link1.add("Zealous");link1.add(98);link1.addLast(true);
		link1.addFirst('R');link1.add("Mayura");link1.add(2,3.4);
		
		System.out.println(link1);
		
		link1.remove(3);
		
		System.out.println(link1);
		
		System.out.println(link1.get(3));
		
		System.out.println(link1.indexOf(false));
		System.out.println(link1.indexOf("Zealous"));
		
		link1.set(0, 102);
		
		System.out.println(link1);
		
		link1.removeLast();
		
		System.out.println(link1.getLast());
		
	}
}
