package application.console.badri.BadriConsoleApplication;

public class CommerceController implements CommerceActions 
{
	private Product[] pro=new Product[20];

	public CommerceController() {
//		pro= new Product[]{
//				new Product("16GB pendrive", "Sandisk", 20, new String[] {"Black","Red"}, 250),
//				new Product("Airdopes", "Boat", 180, new String[] {"White","Blue","Red"}, 999),
//				new Product("15AC2022 Laptop", "Dell", 45, new String[] {"Grey","Silver","Black"}, 87600)
//		};
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
	public String detachItem(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String detachItem(String itemName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void filter(Integer start, Integer end) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void filter(String color, String model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void filter(String brand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String update(String itemName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void orderQuick() {
		// TODO Auto-generated method stub
		
	}
	
}
