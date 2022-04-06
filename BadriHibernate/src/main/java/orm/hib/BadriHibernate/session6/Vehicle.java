package orm.hib.BadriHibernate.session6;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle 
{
	@Id
	private int regId;
	private int year;
	private int price;
	private String model;
	
//	// many to one execution
//	@ManyToOne
//	private Person person;
//	public Person getPerson() {
//		return person;
//	}
//	public void setPerson(Person person) {
//		this.person = person;
//	}
	
	
	//many to many execution
	@ManyToMany(mappedBy = "gariage")
	private Collection<Person> customers=new ArrayList<Person>();
	
	public Collection<Person> getCustomers() {
		return customers;
	}
	public void setCustomers(Collection<Person> customers) {
		this.customers = customers;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int regId, int year, int price, String model) {
		super();
		this.regId = regId;
		this.year = year;
		this.price = price;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vehicle [regId=" + regId + ", year=" + year + ", price=" + price + ", model=" + model + "]";
	}
	public int getRegId() {
		return regId;
	}
	public void setRegId(int regId) {
		this.regId = regId;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
