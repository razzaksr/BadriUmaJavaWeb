package orm.hib.BadriHibernate.session2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cellphone")
public class Mobile 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private int proId;
	@Column(name = "product_model_name")
	private String model;
	@Column(name = "product_price")
	private int price;
	@Column(name = "product_ram_capacity")
	private int ram;
	@Column(name = "product_internal_capacity")
	private int internal;
	@Column(name = "product_feature")
	private String feature;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String model, int price, int ram, int internal, String feature) {
		super();
		
		this.model = model;
		this.price = price;
		this.ram = ram;
		this.internal = internal;
		this.feature = feature;
	}
	@Override
	public String toString() {
		return "Mobile [proId=" + proId + ", model=" + model + ", price=" + price + ", ram=" + ram + ", internal="
				+ internal + ", feature=" + feature + "]";
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getInternal() {
		return internal;
	}
	public void setInternal(int internal) {
		this.internal = internal;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
}
