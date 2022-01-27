package learn.console.BadriJava.oop;

import java.util.Arrays;

public class DemoAbstract extends Mongo
{
	public static void main(String[] args) 
	{
		//DemoAbstract demo=new DemoAbstract();
		Mongo demo=new DemoAbstract();
		demo.addTechs("JSON");
		demo.addTechs("Cloud");
		demo.addTechs("Shell");
		demo.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(techs));
	}
}


abstract class Mongo
{
	String[] techs=new String[10];// {"JSON","NoSQL","Atlas","Clous","Compass","Shell"};
	// non abstract
	public void addTechs(String tech)
	{
		for(int index=0;index<techs.length;index++)
		{
			if(techs[index]==null)
			{
				techs[index]=tech;
				System.out.println(tech+" added to Mongo");
				return;
			}
		}
		System.out.println(tech+" couldn't be added");
	}
	
	public abstract void show();
}