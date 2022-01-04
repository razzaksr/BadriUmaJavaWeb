package learn.console.BadriJava.array;

import java.util.Arrays;

/*
 * Searching: getting position by object
 * Linear: Un sorted array >> visits every position to find			>> O(n) 
 * Binary: Sorted array		> dynamically search ranges will vary	>> O(logn)
 * 
 * 
 * O(1), O(logn),O(n),O(nlogn),O(n2),......
 */

public class Searchings 
{
	public static int linear(Character[] got,char data)
	{
		for(int pos=0;pos<got.length;pos++)
		{
			if(got[pos]==data)
				return pos;
		}
		return -1;
	}
	public static int binary(Character[] yet,int start,int end,char data)
	{
		if(start<=end)
		{
			int mid=(end+start)/2;
			if(yet[mid]==data)
				return mid;
			else if(yet[mid]>data)
				return binary(yet, start, mid, data);
			else
				return binary(yet, mid+1, end, data);
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		Character[] blocks= {'Z','E','A','L','O','U','S'}; 
		System.out.println(Searchings.linear(blocks, 'O'));
		Arrays.sort(blocks);
		// AELOSUZ
		System.out.println(Searchings.binary(blocks, 0, blocks.length-1, 'O'));
	}
}
