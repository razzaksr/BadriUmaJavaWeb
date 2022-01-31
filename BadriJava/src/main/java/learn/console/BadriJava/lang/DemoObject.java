package learn.console.BadriJava.lang;

public class DemoObject 
{
	public static void main(String[] args) 
	{
		DemoObject demo=new DemoObject();
		Double hai=4.5;
		System.out.println(hai.floatValue());
		
		Object obj=(Object)hai;
		
		System.out.println(obj.toString());
		
		obj='A';
		
		Character yet=(Character)obj;
		
		System.out.println(yet.charValue());
	}
}
