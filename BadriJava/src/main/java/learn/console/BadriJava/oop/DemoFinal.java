package learn.console.BadriJava.oop;

public class DemoFinal extends MyBundle 
{
	public void list()
	{
		System.out.println("Overridden from mybundle");
		super.list();
	}
	// since sort @ MyBundle is final, we can't override
//	public void sort()
//	{
//		System.out.println("Sorting @ DemoFinal");
//	}
	public static void main(String[] args) 
	{
		DemoFinal demo=new DemoFinal();
		demo.list();
	}
}
