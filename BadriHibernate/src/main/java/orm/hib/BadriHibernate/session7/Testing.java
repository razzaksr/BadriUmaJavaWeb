package orm.hib.BadriHibernate.session7;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@DiscriminatorValue("QC")
public class Testing extends Project 
{
	
	private String type;
	private String tools;
	private int teamLength;
	public Testing() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Testing(String name, String client, String manager) {
		super(name, client, manager);
		// TODO Auto-generated constructor stub
	}
	public Testing(String type, String tools, int teamLength) {
		super();
		this.type = type;
		this.tools = tools;
		this.teamLength = teamLength;
	}
	@Override
	public String toString() {
		return "Testing [type=" + type + ", tools=" + tools + ", teamLength=" + teamLength
				+ "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTools() {
		return tools;
	}
	public void setTools(String tools) {
		this.tools = tools;
	}
	public int getTeamLength() {
		return teamLength;
	}
	public void setTeamLength(int teamLength) {
		this.teamLength = teamLength;
	}
}
