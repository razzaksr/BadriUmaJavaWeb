package mvc.badri.spring.BadriSpringThyme;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Corporate 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int corpId;
	private String corpName;
	private String[] opennings;
	private String[] locations;
	private double ctc;
	public String gettingOpens()
	{
		return Arrays.toString(this.opennings);
	}
	public String gettingLocs()
	{
		return Arrays.toString(this.locations);
	}
	public Corporate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Corporate(String corpName, String[] opennings, String[] locations, double ctc) {
		super();
		this.corpName = corpName;
		this.opennings = opennings;
		this.locations = locations;
		this.ctc = ctc;
	}
	@Override
	public String toString() {
		return "Corporate [corpId=" + corpId + ", corpName=" + corpName + ", opennings=" + Arrays.toString(opennings)
				+ ", locations=" + Arrays.toString(locations) + ", ctc=" + ctc + "]";
	}
	public int getCorpId() {
		return corpId;
	}
	public void setCorpId(int corpId) {
		this.corpId = corpId;
	}
	public String getCorpName() {
		return corpName;
	}
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}
	public String[] getOpennings() {
		return opennings;
	}
	public void setOpennings(String[] opennings) {
		this.opennings = opennings;
	}
	public String[] getLocations() {
		return locations;
	}
	public void setLocations(String[] locations) {
		this.locations = locations;
	}
	public double getCtc() {
		return ctc;
	}
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
}
