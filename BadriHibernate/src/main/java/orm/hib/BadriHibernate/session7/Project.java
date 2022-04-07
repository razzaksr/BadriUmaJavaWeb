package orm.hib.BadriHibernate.session7;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity

@Inheritance(strategy = InheritanceType.JOINED)

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "team")
//@DiscriminatorValue("BA")
public class Project 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	//@Id @GeneratedValue(strategy = GenerationType.TABLE)
	private int proId;
	private String name;
	private String client;
	private String manager;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(String name, String client, String manager) {
		super();
		this.name = name;
		this.client = client;
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Project [proId=" + proId + ", name=" + name + ", client=" + client + ", manager=" + manager + "]";
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
}
