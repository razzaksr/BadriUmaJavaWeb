package learn.console.BadriJava.oop;

public class Google 
{
	private String username,fullname;
	private String password;
	private Long contact;
	@Override
	public String toString() {
		return "Google [username=" + username + ", fullname=" + fullname + ", contact=" + contact + "]";
	}
	public Google() {
		System.out.println("Google created");
		// TODO Auto-generated constructor stub
	}
	public Google(String username, String fullname, String password, Long contact) {
		this.username = username;
		this.fullname = fullname;
		this.password = password;
		this.contact = contact;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	
}
