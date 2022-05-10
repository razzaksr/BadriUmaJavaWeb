package react.rest.BadriRestReact;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService
{
	@Autowired
	ContactRepository repo;
	
	public Contact create(Contact con)
	{
		return repo.save(con);
	}
	
	public Optional<Contact> get(int id)
	{
		return repo.findById(id);
	}
	
	public List<Contact> list()
	{
		return repo.findAll();
	}
	
	public String del(int id)
	{
		String hi=repo.getById(id).getName()+" has deleted";
		repo.deleteById(id);
		return hi;
	}
}
