package learn.console.BadriJava;

public class Having 
{
	public static void main(String[] args) 
	{
		Machine mac=new Machine();
		System.out.println(mac.enquiry());
		mac.deposit(3400);
		System.out.println(mac.enquiry());
		System.out.println(mac.transfer(70000));
		
	}
}


class Machine
{
	private Integer available=59800;

	/*
	 * // return and no param public Integer getAvailable() { return available; } //
	 * no return and param public void setAvailable(Integer available) {
	 * this.available = available; }
	 */
	
	// return and no param
	public Integer enquiry() {return this.available;}
	// no return and param
	public void deposit(Integer dep)
	{
		this.available+=dep;
		System.out.println(dep+" has added in the machine");
	}
	// return and param
	public Integer transfer(Integer amt)
	{
		if(this.available>=amt)
		{
			this.available-=amt;
			System.out.println("Transaction done");
			return this.available;
		}
		return -1;
	}
}