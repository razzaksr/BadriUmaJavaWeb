package orm.hib.BadriHibernate.session1;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Projector 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stkId;
	public Projector(Integer stkId, String modelName, Date dop, Double price, String color) {
		super();
		this.stkId = stkId;
		this.modelName = modelName;
		this.dop = dop;
		this.price = price;
		this.color = color;
	}
	public Integer getStkId() {
		return stkId;
	}
	public void setStkId(Integer stkId) {
		this.stkId = stkId;
	}
	private String modelName;
	private Date dop;
	private Double price;
	private String color;
	@Override
	public String toString() {
		return "Projector [stkId=" + stkId + ", modelName=" + modelName + ", dop=" + dop + ", price=" + price
				+ ", color=" + color + "]";
	}
	public Projector() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projector(String modelName, Date dop, Double price, String color) {
		super();
		this.modelName = modelName;
		this.dop = dop;
		this.price = price;
		this.color = color;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Date getDop() {
		return dop;
	}
	public void setDop(Date dop) {
		this.dop = dop;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
