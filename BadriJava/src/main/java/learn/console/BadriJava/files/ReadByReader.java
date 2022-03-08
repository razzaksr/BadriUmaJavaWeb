package learn.console.BadriJava.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadByReader 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Course backups\\Web\\Combo\\Bootstrap\\navigation.html");
		FileReader reader=new FileReader(file);
		
		int tmp=0;
		while((tmp=reader.read())!=-1)
		{
			System.out.print((char)tmp);
		}
		
		reader.close();
	}
}
