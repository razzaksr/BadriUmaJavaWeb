package learn.console.BadriJava.oop;

import java.util.Arrays;
import java.util.Scanner;

public class DemoMultilevel 
{
	public static void main(String[] args) 
	{
		Wind w=new Wind();
		w.show();// mypack
		System.out.println(w.binarySearch(0, w.yet.length-1, "Hiddleston", w.yet));// myprocess
		w.makeOrder();// wind
	}
}

class Wind extends MyProcess // multi level
{
	Scanner scan=new Scanner(System.in);
	private String[][] tags= {
			{"Marquee","Header","Font"},
			{"Division","Section","Bold"},
			{"Carousel","Forms","Cards","Breakpoints"}// Break,Cards,Carousel,Forms
	};
	public void makeOrder()
	{
		System.out.println("Tell us which row u about to search: ");
		int row=scan.nextInt();
		if(row<tags.length)
		{
			Arrays.sort(tags[row]);
			System.out.println("Tell us what to search @ "+row);
			String data=scan.next();
			System.out.println(binarySearch(0, tags[row].length-1, data,tags[row]));
		}
		else {
			System.out.println("Invalid row");
		}
	}
}