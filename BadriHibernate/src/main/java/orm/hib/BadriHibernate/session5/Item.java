package orm.hib.BadriHibernate.session5;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Item 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int itemId;
	private String itemName;
	@Temporal(TemporalType.DATE)
	private Date itemExpiry;
	@Column(insertable = false)
	private String brand;
	@Transient
	private int price;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Date getItemExpiry() {
		return itemExpiry;
	}
	public void setItemExpiry(Date itemExpiry) {
		this.itemExpiry = itemExpiry;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemExpiry=" + itemExpiry + ", brand=" + brand
				+ ", price=" + price + "]";
	}
	public Item(String itemName, Date itemExpiry, String brand, int price) {
		super();
		this.itemName = itemName;
		this.itemExpiry = itemExpiry;
		this.brand = brand;
		this.price = price;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
}
