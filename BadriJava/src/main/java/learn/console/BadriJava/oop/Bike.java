package learn.console.BadriJava.oop;

// model,year,cc,milage,price,quantity>> properties, data
// private properties can be accessed by other members of same class not from outside>> data hide

public class Bike 
{
	// class level member
	private String model;
	private int year,cc,milage,quantity;
	private double price;
	
	public Bike()// default
	{
		System.out.println("Welcome to Swarnambigai bajaj");
	}
	
	public Bike(String model, int year, int cc, int milage, int quantity, double price) {
		this.model = model;
		this.year = year;
		this.cc = cc;
		this.milage = milage;
		this.quantity = quantity;
		this.price = price;
	}



	// when ever object of bike class inside of sysout or assigning to string property
	@Override
	public String toString() {
		return "Bike [model=" + model + ", year=" + year + ", cc=" + cc + ", milage=" + milage + ", quantity="
				+ quantity + ", price=" + price + "]";
	}

	//setter
	public void setModel(String model)// local scope to setModel()
	{
		this.model=model;
	}
	
	public String getModel()
	{
		return model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
