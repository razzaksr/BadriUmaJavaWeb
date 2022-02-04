package learn.console.BadriJava.handle;

import java.io.IOException;

public class Compiling 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Runtime run=Runtime.getRuntime();
		Process pro=null;
		pro = run.exec("mspaint");
		Thread.sleep(2000);
		pro = run.exec("notepad");
		Thread.sleep(2000);
		pro = run.exec("calc");
		Thread.sleep(2000);
		pro = run.exec("control");
	}
}
