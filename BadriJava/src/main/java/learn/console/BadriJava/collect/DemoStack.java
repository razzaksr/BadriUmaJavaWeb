package learn.console.BadriJava.collect;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/*
 * List: Stack
 * Last In First Out
 * 
 * push
 * pop
 * search
 * peek
 * clear
 */

public class DemoStack 
{
	public static void main(String[] args) 
	{
		// legacy way
		Stack stk1=new Stack();// generic
		Stack<Integer> stk2=new Stack<Integer>();// non generic
		
		List stk3=new Stack();
		
		
		stk1.push("Razak Mohamed");stk1.push(30);
		stk1.push(85.9);stk1.push('S');
		
		stk2.push(23);stk2.push(23);stk2.push(20);stk2.push(12);
		stk2.push(3);stk2.push(2);stk2.push(77);
		
		stk3.add(34.8);
		
		//System.out.println(stk1);
		System.out.println(stk2);
		
		Iterator<Object> it=stk1.iterator();
		//Iterator<Integer> it=stk2.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		stk2.pop();
		
		System.out.println(stk2.peek());
		
		stk2.clear();
		
		System.out.println(stk2.isEmpty());
		
		System.out.println(stk1.search("Razak Mohamed"));
		System.out.println(stk1.search(false));
	}
}
