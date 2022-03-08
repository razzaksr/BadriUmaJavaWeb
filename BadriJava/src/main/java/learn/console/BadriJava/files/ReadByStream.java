package learn.console.BadriJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadByStream 
{
	public static void main(String[] args) throws IOException 
	{
		//File file=new File("D:\\Course backups\\Python\\AarthiAnnakiliDjango\\Basic\\Basic\\settings.py");
		File file=new File("D:\\Course backups\\Web\\Combo\\Bootstrap\\carousel.html");
		FileInputStream fis=new FileInputStream(file);
		
		byte[] tmp=new byte[fis.available()];
		fis.read(tmp);
		System.out.println(new String(tmp));
		
		fis.close();
	}
}
