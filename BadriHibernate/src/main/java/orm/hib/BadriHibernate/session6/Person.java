package orm.hib.BadriHibernate.session6;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;
	private String custName;
	private String location;
	private long mobile;
	public Person() {
		super();
	}
	
	//many to many execution
	@ManyToMany
	private Collection<Vehicle> gariage=new ArrayList<Vehicle>();
	
	public Collection<Vehicle> getGariage() {
		return gariage;
	}


	public void setGariage(Collection<Vehicle> gariage) {
		this.gariage = gariage;
	}


	// many to one execution
	public Person(String custName, String location, long mobile) {
		super();
		this.custName = custName;
		this.location = location;
		this.mobile = mobile;
	}

	
//	
//	// one to mant execution
//	@OneToMany(cascade = CascadeType.PERSIST)
//	@JoinTable(name="Customer_Transport_Info",joinColumns = @JoinColumn(name="Customer_ID"),inverseJoinColumns = @JoinColumn(name="Resgistration_Number"))
//	private Collection<Vehicle> gariage=new ArrayList<Vehicle>();
//	
//	public Person(String custName, String location, long mobile) {
//		this.custName = custName;
//		this.location = location;
//		this.mobile = mobile;
//	}
//	
//	@Override
//	public String toString() {
//		return "Person [custId=" + custId + ", custName=" + custName + ", location=" + location + ", mobile=" + mobile
//				+ ", gariage=" + gariage + "]";
//	}
//
//	public Collection<Vehicle> getGariage() {
//		return gariage;
//	}
//
//	public void setGariage(Collection<Vehicle> gariage) {
//		this.gariage = gariage;
//	}


//	// one to one execution
//	@OneToOne
//	@JoinColumn(name = "Registration_ID")
//	private Vehicle vehicle;
//	public Vehicle getVehicle() {
//		return vehicle;
//	}
//
//	public void setVehicle(Vehicle vehicle) {
//		this.vehicle = vehicle;
//	}
//
//	
//
//	public Person(String custName, String location, long mobile, Vehicle vehicle) {
//		super();
//		this.custName = custName;
//		this.location = location;
//		this.mobile = mobile;
//		this.vehicle = vehicle;
//	}
//
//	@Override
//	public String toString() {
//		return "Person [custId=" + custId + ", custName=" + custName + ", location=" + location + ", mobile=" + mobile
//				+ ", vehicle=" + vehicle + "]";
//	}

	
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
}
