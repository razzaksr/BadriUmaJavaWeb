package orm.hib.BadriHibernate.session3;

import java.util.Arrays;
import java.util.Date;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ElectrolRoll 
{
	@Id
	private int assemblyNo;
	private String assembly;
	private String sittingMLA;
	private int population;
	private String[] candidates;
	private Date electionDate;
	@Override
	public String toString() {
		return "ElectrolRoll [assemblyNo=" + assemblyNo + ", assembly=" + assembly + ", sittingMLA=" + sittingMLA
				+ ", population=" + population + ", candidates=" + Arrays.toString(candidates) + ", electionDate="
				+ electionDate + "]";
	}
	
	public ElectrolRoll() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectrolRoll(int assemblyNo, String assembly, String sittingMLA, int population, String[] candidates,
			Date electionDate) {
		super();
		this.assemblyNo = assemblyNo;
		this.assembly = assembly;
		this.sittingMLA = sittingMLA;
		this.population = population;
		this.candidates = candidates;
		this.electionDate = electionDate;
	}

	public int getAssemblyNo() {
		return assemblyNo;
	}
	public void setAssemblyNo(int assemblyNo) {
		this.assemblyNo = assemblyNo;
	}
	public String getAssembly() {
		return assembly;
	}
	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}
	public String getSittingMLA() {
		return sittingMLA;
	}
	public void setSittingMLA(String sittingMLA) {
		this.sittingMLA = sittingMLA;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String[] getCandidates() {
		return candidates;
	}
	public void setCandidates(String[] candidates) {
		this.candidates = candidates;
	}
	public Date getElectionDate() {
		return electionDate;
	}
	public void setElectionDate(Date electionDate) {
		this.electionDate = electionDate;
	}
	
}
