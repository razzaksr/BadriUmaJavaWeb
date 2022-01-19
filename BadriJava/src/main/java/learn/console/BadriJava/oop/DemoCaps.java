package learn.console.BadriJava.oop;

public class DemoCaps 
{
	public static void main(String[] args) 
	{
		Bike bk=new Bike();
		//bk.cc=120;bk.milage=60;bk.model="Activa";bk.price=79000.3;bk.quantity=20;bk.year=2021;
		bk.setModel("Avenger Cruise");bk.setCc(220);bk.setMilage(40);bk.setPrice(110000.5);bk.setQuantity(15);
		bk.setYear(2022);
		System.out.println("My bike details are: ");
		//System.out.println(bk.model+" "+bk.cc+" "+bk.milage+" "+bk.year+" "+bk.quantity+" "+bk.price);
		//System.out.println(bk.getModel()+" "+bk.getYear()+" "+bk.getCc()+" "+bk.getMilage()+" "+bk.getQuantity()+" "+bk.getPrice());
		System.out.println(bk);
		
		Bike bc=new Bike("ApacheRTR",2022,200,35,10,120000.5);
		//bc.setCc(200);bc.setMilage(35);bc.setModel("ApacheRTR");bc.setPrice(124000.5);bc.setQuantity(10);bc.setYear(2022);
		System.out.println("Bike properties are: ");
		System.out.println(bc.getModel()+" "+bc.getYear()+" "+bc.getCc()+" "+bc.getMilage()+" "+bc.getQuantity()+" "+bc.getPrice());
		
		
	}
}
