package orm.hib.BadriHibernate.session7;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@DiscriminatorValue("Coder")
public class Development extends Project 
{
	private String technology;
	private int backlog;
	private String past;
	public Development() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Development(String name, String client, String manager) {
		super(name, client, manager);
		// TODO Auto-generated constructor stub
	}
	public Development(String technology, int backlog, String past) {
		super();
		this.technology = technology;
		this.backlog = backlog;
		this.past = past;
	}
	@Override
	public String toString() {
		return "Development [ technology=" + technology + ", backlog=" + backlog
				+ ", past=" + past + "]";
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public int getBacklog() {
		return backlog;
	}
	public void setBacklog(int backlog) {
		this.backlog = backlog;
	}
	public String getPast() {
		return past;
	}
	public void setPast(String past) {
		this.past = past;
	}
}
