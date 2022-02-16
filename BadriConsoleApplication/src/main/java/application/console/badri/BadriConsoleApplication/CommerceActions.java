package application.console.badri.BadriConsoleApplication;

public interface CommerceActions 
{
	public String newStock(Product product);
	public Product[] available();
	public String detachItem(Product product);
	public String detachItem(String itemName);
	public void filter(Integer start,Integer end);
	public void filter(String color,String model);
	public void filter(String brand);
	public String update(String itemName);
	public void orderQuick();
}
