package orm.hib.BadriHibernate.session4;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.id.IdentifierGenerator;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Resource 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resId;
	private String resName;
	private int exp;
	private double ctc;
	@ElementCollection
	@JoinTable(name = "Resource_Proficiency",joinColumns = @JoinColumn(name="Employee_id"))
	@GenericGenerator(name="mygen",strategy="sequence")
	@CollectionId(generator = "mygen",columns = {@Column(name = "tech_id")},type = @Type(type="long"))
	//@CollectionIdJavaType(value = Class<BasicJavaType<?>>)
	private Collection<Technology> skills=new ArrayList<Technology>();
	public Resource( String resName, int exp, double ctc, Collection<Technology> skills) {
		super();
		
		this.resName = resName;
		this.exp = exp;
		this.ctc = ctc;
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Resource [resId=" + resId + ", resName=" + resName + ", exp=" + exp + ", ctc=" + ctc + ", skills="
				+ skills + "]";
	}
	public Collection<Technology> getSkills() {
		return skills;
	}
	public void setSkills(Collection<Technology> skills) {
		this.skills = skills;
	}
	//	@Embedded
//	private Technology tech;
//	@Embedded
//	@AttributeOverrides({
//		@AttributeOverride(name="name",column = @Column(name="new_technology")),
//		@AttributeOverride(name="apps",column = @Column(name="new_technology_apps")),
//		@AttributeOverride(name="gitDemand",column = @Column(name="new_technology_demand")),
//		@AttributeOverride(name="type",column = @Column(name="new_technology_types"))
//	})
//	private Technology newtech;
//	public Resource( String resName, int exp, double ctc, Technology tech, Technology newtech) {
//		super();
//		
//		this.resName = resName;
//		this.exp = exp;
//		this.ctc = ctc;
//		this.tech = tech;
//		this.newtech = newtech;
//	}
//	@Override
//	public String toString() {
//		return "Resource [resId=" + resId + ", resName=" + resName + ", exp=" + exp + ", ctc=" + ctc + ", tech=" + tech
//				+ ", newtech=" + newtech + "]";
//	}
//	public Technology getNewtech() {
//		return newtech;
//	}
//	public void setNewtech(Technology newtech) {
//		this.newtech = newtech;
//	}
//	public Technology getTech() {
//		return tech;
//	}
//	public void setTech(Technology tech) {
//		this.tech = tech;
//	}
	public Resource() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public Resource(String name, int exp, double ctc, Technology tech) {
//		super();
//		this.resName = name;
//		this.exp = exp;
//		this.ctc = ctc;
//		this.tech = tech;
//	}
//	@Override
//	public String toString() {
//		return "Resource [resId=" + resId + ", name=" + resName + ", exp=" + exp + ", ctc=" + ctc + ", tech=" + tech + "]";
//	}
	public int getResId() {
		return resId;
	}
	public void setResId(int resId) {
		this.resId = resId;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String name) {
		this.resName = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public double getCtc() {
		return ctc;
	}
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
}
