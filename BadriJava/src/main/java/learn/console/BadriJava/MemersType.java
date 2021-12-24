package learn.console.BadriJava;

public class MemersType 
{
	public static void main(String[] args) 
	{
		Flipkart kart1=new Flipkart();
		kart1.username="badri";kart1.address="Salem";kart1.pin=636006;kart1.mobile=8765456745L;
		Flipkart.noOfOrders=90;//kart1.noOfOrders=12;
		Flipkart kart2=new Flipkart();
		kart2.username="umadevi";kart2.address="Omalur";kart2.pin=636406;kart2.mobile=98765456765L;
		Flipkart.noOfOrders=2;//kart2.noOfOrders=20;
		//kart1.info();
		kart1.noOfOrders=10;
		//kart2.info();
		
		Flipkart.hai(kart1);
		Flipkart.hai(kart2);
	}
}


class Flipkart
{
	String username;
	String address;
	Long mobile;
	Integer pin;
	static Integer noOfOrders=0;
	// no return no param
	public void info()
	{
		System.out.println("Your name is "+this.username+" address "+this.address+" in "+this.pin+" of contact number "+this.mobile+" no of orders is "+this.noOfOrders);
	}
	public static void hai(Flipkart fp)
	{
		System.out.println("Your name is "+fp.username+" address "+fp.address+" in "+fp.pin+" of contact number "+fp.mobile+" no of orders is "+fp.noOfOrders);
	}
}