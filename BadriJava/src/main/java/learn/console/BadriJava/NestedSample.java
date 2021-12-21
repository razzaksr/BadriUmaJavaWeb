package learn.console.BadriJava;

public class NestedSample 
{
	public static void main(String[] args) 
	{
		for(int hai=1;hai<=10;hai++)
		{
			System.out.println("Table of "+hai);
			//System.out.println("Hai There! @ "+hai);
			for(int yet=1;yet<=10;yet++)
			{
				//System.out.println("Hey am yet to join! @ "+yet);
				System.out.println(yet+" X "+hai+" = "+(hai*yet));
			}
		}
	}
}
