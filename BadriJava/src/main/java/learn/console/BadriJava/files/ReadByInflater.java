package learn.console.BadriJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class ReadByInflater 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("West.txt");
//		FileOutputStream fos=new FileOutputStream(file);
//		DeflaterOutputStream dos=new DeflaterOutputStream(fos);
//		
//		String yet="Zealous Tech corp best foundry to groom your technical knowledge";
//		dos.write(yet.getBytes());
//		
//		dos.close();
//		fos.close();
		
		FileInputStream fis=new FileInputStream(file);
		InflaterInputStream iis=new InflaterInputStream(fis);
		
		byte[] tmp=new byte[fis.available()];
		iis.read(tmp);
		
		System.out.println(new String(tmp));
		iis.close();
		fis.close();
	}
}
