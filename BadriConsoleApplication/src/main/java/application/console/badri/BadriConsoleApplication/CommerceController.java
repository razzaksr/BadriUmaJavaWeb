package application.console.badri.BadriConsoleApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CommerceController implements CommerceActions 
{
	private ArrayList<Product> pro=new ArrayList<Product>();

	public CommerceController() {
		pro.add(new Product("16GBpendrive", "Sandisk", 20, new String[] {"Black","Red"}, 250));
		pro.add(new Product("Airdopes", "Boat", 180, new String[] {"White","Blue","Red"}, 999));
		pro.add(new Product("15AC2022Laptop", "Dell", 45, new String[] {"Grey","Silver","Black"}, 87600));
		pro.add(new Product("64GBpendrive", "Transcend", 30, new String[] {"White","Blue","Grey"}, 540));
		pro.add(new Product("Sneakers", "Puma", 90, new String[] {"Black","White","Blue","Red"}, 1299));
		pro.add(new Product("Smartwatch", "Boat", 190, new String[] {"Black","White","Blue","Red","Green"}, 2399));
		pro.add(new Product("Beanbag", "Comfy", 30, new String[] {"Black","White"}, 2100));
	}

	public CommerceController(ArrayList<Product> pro) {
		super();
		this.pro = pro;
	}

	@Override
	public String newStock(Product product) {
		// TODO Auto-generated method stub
		pro.add(product);
		return product.getModelName()+" has added into ConsoleKart";
	}

	@Override
	public List<Product> available() {
		// TODO Auto-generated method stub
		return pro;
	}

	@Override
	public String detachItem(Integer position) {
		// TODO Auto-generated method stub
		if(pro.size()>=position)
		{
			String nm=pro.get(position).getModelName();
			pro.remove((int)position);
			return nm+" has removed";
		}
		else
			return "Invalid index";
	}

	@Override
	public String detachItem(String itemName) {
		// TODO Auto-generated method stub
		for(int index=0;index<pro.size();index++)
		{
			if(pro.get(index).getModelName().equals(itemName))
			{
				String ack=pro.get(index).getModelName()+" has deleted ";
				pro.remove(index);
				return ack;
			}
		}
		return "No item found as "+itemName;
	}

	@Override
	public void filter(Integer start, Integer end) {
		// TODO Auto-generated method stub
		if(start<=end&&end<pro.size())
		{
			for(;start<=end;start++)
			{
				System.out.println(pro.get(start));
			}
		}
		else
			System.out.println(start+" and "+end+" boundry invalid");
	}

	@Override
	public void filter(String color, String model) {
		// TODO Auto-generated method stub
		for(int index=0;index<pro.size();index++)
		{
			if(Arrays.toString(pro.get(index).getColors()).contains(color)&&pro.get(index).getModelName().equals(model))
			{
				System.out.println(pro.get(index));
			}
		}
	}

	@Override
	public void filter(String brand,int start,int end) {
		// TODO Auto-generated method stub
		if(start<=end)
		{
			int mid=(end+start)/2;
			if(pro.get(mid).getBrand().compareTo(brand)==0)
			{
				System.out.println(pro.get(mid)+"\nFound @ "+mid+" position");
			}
			else if(pro.get(mid).getBrand().compareTo(brand)<0)
				filter(brand, start, mid);
			else
				filter(brand, mid+1, end);
		}
		else
			System.out.println(brand+" Brand doesn't match anywhere");
	}

	@Override
	public String update(String itemName) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(int index=0;index<pro.size();index++)
		{
			if(pro.get(index).getModelName().equals(itemName))
			{
				System.out.println(pro.get(index));
				System.out.println("Tell us what to update(name,brand,qty,price,color): ");
				String criteria=scan.next();
				criteria=criteria.toLowerCase();
				switch(criteria)
				{
				case "name":
					System.out.println("Tell us new ModelName: ");
					String item=scan.next();
					pro.get(index).setModelName(item);
					return item+" has updated as modelName";
				case "brand":
					System.out.println("Tell us new brand name: ");
					String bnd=scan.next();
					pro.get(index).setBrand(bnd);
					return bnd+" has updated as Brand "+itemName;
				case "qty":
					System.out.println("Tell us new quantity: ");
					int q=scan.nextInt();
					pro.get(index).setQuantity(q);
					return q+" has updated as new Quantity "+itemName;
				case "price":
					System.out.println("Tell us new cost: ");
					int c=scan.nextInt();
					pro.get(index).setPrice(c);;
					return c+" has updated as new price of "+itemName;
				case "color":
					System.out.println("Available colors are: "+Arrays.toString(pro.get(index).getColors()));
					System.out.println("Do you wish to add new color or update existing one: ");
					String wish=scan.next();
					if(wish.equalsIgnoreCase("new"))
					{
						System.out.println("Tell us new color to add: ");
						String users=scan.next();
						String tmp=Arrays.toString(pro.get(index).getColors())+","+users;
						pro.get(index).setColors(tmp.split(","));
						return users+" color has added newly for "+itemName;
					}
					else if(wish.equalsIgnoreCase("modify")) 
					{
						System.out.println("Tell us what to modify: ");
						String what=scan.next();
						System.out.println("Tell us which you wish to replace: ");
						String which=scan.next();
						String tmp=Arrays.toString(pro.get(index).getColors());
						tmp.replace(what, which);
						pro.get(index).setColors(tmp.split(","));
						return which+" color has replaced "+what+" on "+itemName;
					}
				}
			}
		}
		return itemName+" hasn't found anywhere";
	}
	
	private int qsort(int start,int end)
	{
		Product piData=pro.get(end);
		int initial=start-1;
		
		for(int current=start;current<end;current++)
		{
			if(pro.get(current).getBrand().compareToIgnoreCase(piData.getBrand())>0)
			{
				initial++;
				Product third=pro.get(current);
				pro.set(current, pro.get(initial));//pro[current]=pro[initial];
				pro.set(initial,third);
			}
		}
		
		Product third=pro.get(end);
		pro.set(end, pro.get(initial+1));//pro[end]=pro[initial+1];
		pro.set(initial+1,third);
		
		return initial+1;
	}
	private void quick(int start,int end)
	{
		if(start<end)
		{
			int pPoint=qsort(start, end);
			quick(start, pPoint-1);
			quick(pPoint+1, end);
		}
	}

	@Override
	public void orderQuick() 
	{
		//quick(0, pro.size()-1);
		Collections.sort(pro);
	}
}
