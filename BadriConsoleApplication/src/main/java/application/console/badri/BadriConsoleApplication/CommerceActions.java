package application.console.badri.BadriConsoleApplication;

import java.util.List;

public interface CommerceActions 
{
	public String newStock(Product product);
	public List<Product> available();
	public String detachItem(Integer position);
	public String detachItem(String itemName);
	public void filter(Integer start,Integer end);
	public void filter(String color,String model);
	public void filter(String brand,int start,int end);
	public String update(String itemName);
	public void orderQuick();
}
