package mvc.badri.spring.BadriSpringThyme;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorporateService 
{
	@Autowired
	CorporateRespository repo;
	
	public Optional<Corporate> gettingOne(int key)
	{
		return repo.findById(key);
	}
	
	public Corporate gettingOneObj(int key)
	{
		return repo.findById(key).orElse(new Corporate());
	}
	
	public List<Corporate> listing()
	{
		return (List<Corporate>) repo.findAll();
	}
	
	public Corporate saving(Corporate corp)
	{
		return repo.save(corp);
	}
}
