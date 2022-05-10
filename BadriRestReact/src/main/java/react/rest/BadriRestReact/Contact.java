package react.rest.BadriRestReact;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contId;
	private String name;
	private String email;
	private long contact;
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public int getContId() {
		return contId;
	}
	public void setContId(int contId) {
		this.contId = contId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Contact [contId=" + contId + ", name=" + name + ", email=" + email + ", contact=" + contact + "]";
	}
	public Contact(int contId, String name, String email, long contact) {
		super();
		this.contId = contId;
		this.name = name;
		this.email = email;
		this.contact = contact;
	}
	public Contact(String name, String email, long contact) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
}
