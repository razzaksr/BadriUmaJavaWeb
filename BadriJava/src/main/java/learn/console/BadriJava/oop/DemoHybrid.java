package learn.console.BadriJava.oop;

public class DemoHybrid 
{
	public static void main(String[] args) 
	{
		GPay pay=new GPay();
		pay.setHolder("Kumaraganesan");pay.setBalance(899999.3);pay.setNumber(9876556789L);
		pay.transfer("badri@okaxis", 12800);
		System.out.println(pay.deposit(15000));
		pay.withdraw(100000);
		pay.balance();
	}
}

class GPay extends Banking implements Wallet
{
	
	@Override
	public double deposit(int amt) {
		// TODO Auto-generated method stub
		setBalance(getBalance()+amt);
		System.out.println(amt+" has deposited @ "+getNumber());
		return getBalance();
	}

	@Override
	public void withdraw(int amt) {
		// TODO Auto-generated method stub
		if(getBalance()>=amt)
		{
			setBalance(getBalance()-amt);
			System.out.println(amt+" has withdrawn successfully from "+getNumber());
		}
		else
		{
			System.out.println(amt+" is insufficient with account balance "+getNumber());
		}
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println(getBalance()+" is available in your "+getNumber()+" of "+getHolder());
	}

	@Override
	public void transfer(String upi,int amt) {
		// TODO Auto-generated method stub
		if(getBalance()>=amt)
		{
			setBalance(getBalance()-amt);
			System.out.println(amt+" has been transferred to "+ upi +" successfully from "+getNumber());
		}
		else
		{
			System.out.println(amt+" is insufficient account balance in "+getNumber());
		}
	}
	
}

interface Wallet extends BankProcess
{
	public void transfer(String upi,int amt);
}

interface BankProcess
{
	public double deposit(int amt);
	public void withdraw(int amt);
	public void balance();
}

class Banking
{
	private String holder;
	private long number;
	private double balance;
	public Banking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Banking(String holder, long number, double balance) {
		super();
		this.holder = holder;
		this.number = number;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Banking [holder=" + holder + ", number=" + number + ", balance=" + balance + "]";
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}