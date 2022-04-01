package orm.hib.BadriHibernate.session4;

import java.util.Arrays;

import javax.persistence.Embeddable;

@Embeddable
public class Technology 
{
	private String name;
	private String[] apps;
	private int gitDemand;
	private String type;
	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technology(String name, String[] apps, int gitDemand, String type) {
		super();
		this.name = name;
		this.apps = apps;
		this.gitDemand = gitDemand;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Technology [name=" + name + ", apps=" + Arrays.toString(apps) + ", gitDemand=" + gitDemand + ", type="
				+ type + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getApps() {
		return apps;
	}
	public void setApps(String[] apps) {
		this.apps = apps;
	}
	public int getGitDemand() {
		return gitDemand;
	}
	public void setGitDemand(int gitDemand) {
		this.gitDemand = gitDemand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
