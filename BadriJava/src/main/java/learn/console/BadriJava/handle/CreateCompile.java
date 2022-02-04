package learn.console.BadriJava.handle;

import java.util.Arrays;

public class CreateCompile 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Alpha alpha=new Alpha();
		alpha.hello();
	}
}


class Alpha
{
	private Integer[][] mark= {{34,67,12,90,56},{45,11,22,7,9,12,90},{3,1},{67,90,2,1,56,23,57,97,6,2,45}};
	public void hello()throws StringIndexOutOfBoundsException,InterruptedException
	{
		for(Integer[] row:mark)
		{
			System.out.println(Arrays.toString(row));
		}
	}
}