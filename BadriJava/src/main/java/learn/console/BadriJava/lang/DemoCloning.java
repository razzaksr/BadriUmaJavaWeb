package learn.console.BadriJava.lang;

public class DemoCloning implements Cloneable
{
	String skillset;
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		DemoCloning kumar=new DemoCloning();
		kumar.skillset="Core Java";
		DemoCloning sasi=new DemoCloning();
		sasi.skillset="Python";
		System.out.println("Kumar: "+kumar.skillset+", Sasi: "+sasi.skillset);
		sasi=kumar;
		System.out.println("Kumar: "+kumar.skillset+", Sasi: "+sasi.skillset);
		kumar.skillset="PHP";
		System.out.println("Kumar: "+kumar.skillset+", Sasi: "+sasi.skillset);
		sasi.skillset="Scala";
		System.out.println("Kumar: "+kumar.skillset+", Sasi: "+sasi.skillset);
		
		DemoCloning uma=new DemoCloning();
		uma.skillset="Javascript";
		System.out.println("Kumar: "+kumar.skillset+", Sasi: "+sasi.skillset+", Umadevi: "+uma.skillset);
		
		uma=(DemoCloning)kumar.clone();
		
		System.out.println("Kumar: "+kumar.skillset+", Sasi: "+sasi.skillset+", Umadevi: "+uma.skillset);
		
		uma.skillset="RasberryPy";
		kumar.skillset="Android";
		
		System.out.println("Kumar: "+kumar.skillset+", Sasi: "+sasi.skillset+", Umadevi: "+uma.skillset);
	}
}
