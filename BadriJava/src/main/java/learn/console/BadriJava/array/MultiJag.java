package learn.console.BadriJava.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Time complexity:
 * Insertion: O(n2)
 * Traverse: O(n2)
 * Read: O(1), O(n2)
 * Update: O(1), O(n2)
 * Delete: O(1), O(n2)
 * Search: Linear >> O(n2), Binary
 * Sort: selection>> O(n3)
 * 
 * 
 */

public class MultiJag 
{
	static Scanner scan=new Scanner(System.in);
	public static void fix(Short[][] hai)
	{
		for(int floor=0;floor<hai.length;floor++)
		{
			for(int home=0;home<hai[floor].length;home++)
			{
				System.out.println("Tell us value ofr rent @ "+floor+" and "+home);
				hai[floor][home]=scan.nextShort();
			}
		}
	}
	
	public static void list(Short[][] data)
	{
//		for(int floor=0;floor<data.length;floor++)
//		{
//			for(int home=0;home<data[floor].length;home++)
//			{
//				System.out.print(data[floor][home]+" ");
//			}
//			System.out.println();
//		}
		for(Short[] floor:data)
		{
			for(Short home:floor)
			{
				System.out.print(home+" ");
			}
			System.out.println();
		}
	}
	
	public static Short read(Short[][] yet,int floor,int home)
	{
		if(floor<yet.length&&home<yet[floor].length)
		{
			return yet[floor][home];
		}
		return 0;
	}
	
	public static Short[] read(Short[][] wet,int min)
	{
		Short[] yet=new Short[30];
		int index=0;
		for(int floor=0;floor<wet.length;floor++)
		{
			for(int home=0;home<wet[floor].length;home++)
			{
				if(wet[floor][home]<=min)
				{
					// copy matched item to yet
					yet[index]=wet[floor][home];
					index++;
				}
			}
		}
		return yet;
	}
	
	public static void selection(Short[][] pow)
	{
		for(int floor=0;floor<pow.length;floor++)
		{
			for(int hold=0;hold<pow[floor].length;hold++)
			{
				for(int com=hold+1;com<pow[floor].length;com++)
				{
					if(pow[floor][hold]>pow[floor][com])
					{
						Short tmp=pow[floor][hold];
						pow[floor][hold]=pow[floor][com];
						pow[floor][com]=tmp;
					}
				}
			}
		}
	}
	
	public static String linear(Short[][] hey,int data)
	{
		for(int floor=0;floor<hey.length;floor++)
		{
			for(int home=0;home<hey[floor].length;home++)
			{
				if(hey[floor][home]==data)
				{
					return data+" found @ "+floor+" row and "+home+" column";
				}
			}
		}
		return data+" isn't found anywhere";
	}
	
	public static void main(String[] args) 
	{
//		Short[][] store=new Short[2][4];
//		Short[][] apart=new Short[3][];
//		apart[0]=new Short[3];
//		apart[1]=new Short[1];
//		apart[2]=new Short[4];
//		MultiJag.fix(store);
//		MultiJag.fix(apart);
		Short[][] store= {{12900,4500,3120,4000},{9200,11200,5400,3200}};
		Short[][] apart= {{8700,1300},{9100,10900,3400,5100},{2100,4000,3100}};
		MultiJag.list(store);
		MultiJag.list(apart);
		
		System.out.println(MultiJag.read(apart, 0, 2));
		System.out.println(MultiJag.read(apart, 2, 2));
		
		System.out.println(Arrays.toString(MultiJag.read(store, 5000)));
		
		System.out.println(MultiJag.linear(store, 4000));
		System.out.println(MultiJag.linear(store, 5400));
		System.out.println(MultiJag.linear(store, 4900));
		System.out.println(MultiJag.linear(apart, 3100));
		
//		MultiJag.selection(store);
//		MultiJag.selection(apart);
//		
//		MultiJag.list(store);
//		MultiJag.list(apart);
		
		
	}
}
