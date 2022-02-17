package application.console.badri.BadriConsoleApplication;

import java.util.Arrays;

public class CommerceController implements CommerceActions 
{
	private Product[] pro=new Product[20];

	public CommerceController() {
		pro= new Product[]{
				new Product("16GB pendrive", "Sandisk", 20, new String[] {"Black","Red"}, 250),
				new Product("Airdopes", "Boat", 180, new String[] {"White","Blue","Red"}, 999),
				new Product("15AC2022 Laptop", "Dell", 45, new String[] {"Grey","Silver","Black"}, 87600),
				new Product("64GB pendrive", "Transcend", 30, new String[] {"White","Blue","Grey"}, 540),
				new Product("Sneakers", "Puma", 90, new String[] {"Black","White","Blue","Red"}, 1299),
		};
	}

	public CommerceController(Product[] pro) {
		super();
		this.pro = pro;
	}

	@Override
	public String newStock(Product product) {
		// TODO Auto-generated method stub
		for(int index=0;index<pro.length;index++)
		{
			if(pro[index]==null)
			{
				pro[index]=product;
				return product.getModelName()+" has added into ConsoleKart";
			}
		}
		return product.getModelName()+" couldn't added to ConsoleKart";
	}

	@Override
	public Product[] available() {
		// TODO Auto-generated method stub
		return pro;
	}

	@Override
	public String detachItem(Integer position) {
		// TODO Auto-generated method stub
		if(position<pro.length&&pro[position]!=null)
		{
			String ack=pro[position].getModelName()+" is removed from stock";
			pro[position]=null;
			return ack;
		}
		else 
			return "No item found @ "+position;
	}

	@Override
	public String detachItem(String itemName) {
		// TODO Auto-generated method stub
		for(int index=0;index<pro.length;index++)
		{
			if(pro[index]!=null&&pro[index].getModelName().equals(itemName))
			{
				String ack=pro[index].getModelName()+" has deleted ";
				pro[index]=null;
				return ack;
			}
		}
		return "No item found as "+itemName;
	}

	@Override
	public void filter(Integer start, Integer end) {
		// TODO Auto-generated method stub
		if(start<=end&&end<pro.length)
		{
			for(;start<=end;start++)
			{
				System.out.println(pro[start]);
			}
		}
		else
			System.out.println(start+" and "+end+" boundry invalid");
	}

	@Override
	public void filter(String color, String model) {
		// TODO Auto-generated method stub
		for(int index=0;index<pro.length;index++)
		{
			if(pro[index]!=null&&Arrays.toString(pro[index].getColors()).contains(color)&&pro[index].getModelName().equals(model))
			{
				System.out.println(pro[index]);
			}
		}
	}

	@Override
	public void filter(String brand,int start,int end) {
		// TODO Auto-generated method stub
		if(start<=end)
		{
			int mid=(end+start)/2;
			if(pro[mid].getBrand().compareTo(brand)==0)
			{
				System.out.println(pro[mid]+"\nFound @ "+mid+" position");
			}
			else if(pro[mid].getBrand().compareTo(brand)<0)
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
		return null;
	}
	
	private int qsort(int start,int end)
	{
		Product piData=pro[end];
		int initial=start-1;
		
		for(int current=start;current<end;current++)
		{
			if(pro[current].getBrand().compareToIgnoreCase(piData.getBrand())>0)
			{
				initial++;
				Product third=pro[current];
				pro[current]=pro[initial];
				pro[initial]=third;
			}
		}
		
		Product third=pro[end];
		pro[end]=pro[initial+1];
		pro[initial+1]=third;
		
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
		quick(0, pro.length-1);
	}
}
