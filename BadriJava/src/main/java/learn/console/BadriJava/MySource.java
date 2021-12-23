package learn.console.BadriJava;

public class MySource 
{
	static
	{
		System.out.println("Static execution");
		MySource my=new MySource();
		my.mod();
		MySource.heyThere();
	}
	
	public static void heyThere()
	{
		System.out.println("Full stack development is in top 10 of 2022 demands");
	}
	
	public void mod()
	{
		System.out.println("User defined method");
		MySource.heyThere();
	}
	public static void main(String[] args) 
	{
		System.out.println("Main execution");
		MySource.heyThere();
	}
}
