package learn.console.BadriJava.oop;

import java.util.Arrays;

public class DemoMultiple extends Disney implements Marvel,DC	// multiple inheritance
{
	public static void main(String[] args) 
	{
		DemoMultiple multiple=new DemoMultiple();
		multiple.crew();
		multiple.avengers();
		multiple.justiceLeague();
	}

	@Override
	public void justiceLeague() {
		// TODO Auto-generated method stub
		System.out.println("Cast of Justice League: ");
		System.out.println(cast[2]+" "+cast[5]+" "+cast[6]);
	}

	@Override
	public void avengers() {
		// TODO Auto-generated method stub
		System.out.println("Cast of avengers: ");
		System.out.println(cast[0]+" "+cast[1]+" "+cast[7]+" "+cast[8]);
	}
}

class Disney
{
	String[] cast= {"Evans","Downey","Pratt","Holland","Hiddleston","Huge","Ryan","Scarlet","Ruffalo"};
	public void crew() {
		System.out.println("All cast booked by disney");
		System.out.println(Arrays.toString(cast));
	}
}

interface Marvel
{
	public void avengers();
}

interface DC
{
	public void justiceLeague();
}