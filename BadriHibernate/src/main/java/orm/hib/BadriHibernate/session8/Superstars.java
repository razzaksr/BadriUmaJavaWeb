package orm.hib.BadriHibernate.session8;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "badri",query = "from Superstars where fightFoughts<:hello")
@NamedNativeQuery(name="razak",query = "select * from superstars where height between :a and :b",resultClass = Superstars.class)
public class Superstars 
{
	@Id
	private int rank;
	private String ringName;
	private double weight;
	private String title;
	private double height;
	private int fightFoughts;
	public Superstars() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Superstars(int rank, String ringName, double weight, String title, double height, int fightFoughts) {
		super();
		this.rank = rank;
		this.ringName = ringName;
		this.weight = weight;
		this.title = title;
		this.height = height;
		this.fightFoughts = fightFoughts;
	}

	@Override
	public String toString() {
		return "Superstars [rank=" + rank + ", ringName=" + ringName + ", weight=" + weight + ", title=" + title
				+ ", height=" + height + ", fightFoughts=" + fightFoughts + "]\n";
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getRingName() {
		return ringName;
	}
	public void setRingName(String ringName) {
		this.ringName = ringName;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getFightFoughts() {
		return fightFoughts;
	}
	public void setFightFoughts(int fightFoughts) {
		this.fightFoughts = fightFoughts;
	}
}
