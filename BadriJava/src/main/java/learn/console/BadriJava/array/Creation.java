package learn.console.BadriJava.array;

import java.util.Arrays;

public class Creation 
{
	public static void forLoop(double[] hi)
	{
		for(int index=0;index<hi.length;index++)
		{
			System.out.println(hi[index]);
		}
	}
	public static void forEachLoop(double[] undo)
	{
		for(double pointer:undo)
		{
			System.out.println(pointer);
		}
	}
	
	public static void myCopy(double[] src,double[] dest)
	{
		for(int pos=0;pos<src.length;pos++)
		{
			dest[pos]=src[pos];
		}
	}
	
	public static void main(String[] args) 
	{
		double[] hello= {4.5,9.7,2.3,12.6,91.4,0.01,5.1};
		double[] hey=new double[10];
		System.out.println(hello.length);
		System.out.println(hey.length);
		System.out.println(hello);
		//System.out.println(Arrays.toString(hello));
		
		//System.out.println(hello[0]);System.out.println(hello[1]);
		
		Creation.forLoop(hello);
		Creation.forEachLoop(hey);
		
//		hey=Arrays.copyOf(hello, hello.length);
//		System.out.println(hey.length);
		
		Creation.myCopy(hello, hey);
		Creation.forEachLoop(hey);
		
		How.fan();
	}
}


class How
{
	public static void gen(int receive)
	{
		System.out.println(receive+" is received");
		receive+=10;
		System.out.println(receive+" is updated");
	}
	public static void hold(int[] yet)
	{
		System.out.println(Arrays.toString(yet)+" is received");
		yet[0]-=5;
		System.out.println(Arrays.toString(yet)+" is updated");
		
	}
	public static void fan()
	{
		int data='A';int[] check= {34,567,3,24,5,67,8,765,43,2,5,1,67,87,};
		System.out.println("0th in fan: "+check[0]);
		//System.out.println("data in fan is: "+data);
		//How.gen(data);
		How.gen(check[0]);
		//System.out.println("data in fan after gen called: "+data);
		System.out.println("0th in fan after gen called: "+check[0]);
		System.out.println("Array in main: "+Arrays.toString(check));
		How.hold(check);
		System.out.println("Array in main after hold called: "+Arrays.toString(check));
	}
}