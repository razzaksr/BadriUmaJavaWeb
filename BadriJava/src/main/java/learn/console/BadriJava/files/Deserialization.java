package learn.console.BadriJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Deserialization 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		File file=new File("East.doc");
		
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(new Bottle("Aqua ville",22,1));
		
		oos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		System.out.println((Bottle)ois.readObject());
		
		ois.close();
		fis.close();
	}
}

class Bottle implements Serializable
{
	private String brand;
	private transient int price;
	private int quantity;
	public Bottle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bottle(String brand, int price, int quantity) {
		super();
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Bottle [brand=" + brand + ", price=" + price + ", quantity=" + quantity + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}