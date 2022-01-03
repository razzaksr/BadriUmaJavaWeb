package learn.console.BadriJava.array;

/*
 * Sorting:
 * Bubble sort		: O(n2)
 * Selection sort	: O(n2)
 * Quick sort		: O(nlogn)
 * 
 * 512 256 128 64 32 16 8 4 2 1
 *   0   0   0  1  1  0 0 0 1 0 >> 98 >> nested
 *   0   0   0  0  0  0 1 0 1 0 >> 10 >> nested+1
 *   0   0   0  1  1  0 1 0 0 0 >> 104 >> nested
 *   0   0   0  1  1  0 0 0 1 0 >> 98 >> nested+1
 *   0   0   0  0  0  0 1 0 1 0 >> 10 >> nested
 */

public class Sortings 
{
	public static void list(Integer[] hai)
	{
		for(Integer tmp:hai)
		{
			System.out.println(tmp);
		}
	}
	public static int qsort(Integer[] wind,int start,int end)
	{
		Integer piData=wind[end];
		int initial=start-1;
		
		for(int current=start;current<end;current++)
		{
			if(wind[current]<piData)
			{
				initial++;
				int third=wind[current];
				wind[current]=wind[initial];
				wind[initial]=third;
			}
		}
		
		int third=wind[end];
		wind[end]=wind[initial+1];
		wind[initial+1]=third;
		
		return initial+1;
	}
	public static void quick(Integer[] wind, int start,int end)
	{
		if(start<end)
		{
			int pPoint=qsort(wind, start, end);
			quick(wind, start, pPoint-1);
			quick(wind, pPoint+1, end);
		}
	}
	public static void selection(Integer[] hai)
	{
		for(int select=0;select<hai.length;select++)
		{
			for(int com=select+1;com<hai.length;com++)
			{
				if(hai[select]<hai[com])
				{
					hai[select]*=hai[com];
					hai[com]=hai[select]/hai[com];
					hai[select]/=hai[com];
				}
			}
		}
	}
	public static void bubble(Integer[] yet)
	{
		for(int outer=0;outer<yet.length-1;outer++)
		{
			for(int nested=0;nested<yet.length-outer-1;nested++)
			{
				if(yet[nested]>yet[nested+1])
				{
					yet[nested]^=yet[nested+1];
					yet[nested+1]^=yet[nested];
					yet[nested]^=yet[nested+1];
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Integer[] store= {98,34,12,67,43,19,67,98,76,54,3,7,2,9,3,11,10};
		System.out.println("Before Sort: ");
		Sortings.list(store);
		//Sortings.bubble(store);
		//Sortings.selection(store);
		Sortings.quick(store, 0, store.length-1);
		System.out.println("After Sort: ");
		Sortings.list(store);
	}
}
