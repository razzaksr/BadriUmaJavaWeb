package react.rest.BadriRestReact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class ContactController 
{
	@Autowired
	ContactService serv;
	
	@GetMapping("/")
	public List<Contact> show()
	{
		return serv.list();
	}
	
	@PostMapping("/")
	public String add(@RequestBody Contact contact)
	{
		System.out.println(contact);
		return serv.create(contact).getName()+" has created";
	}
	
	@DeleteMapping("/{id}")
	public String remove(@PathVariable("id") int id)
	{
		return serv.del(id);
	}
	
	@GetMapping("/{id}")
	public Contact read(@PathVariable("id") int id)
	{
		return serv.get(id).get();
	}
	
	@PutMapping("/")
	public String update(@RequestBody Contact contact)
	{
		return serv.create(contact).getName()+" has updated";
	}
}
