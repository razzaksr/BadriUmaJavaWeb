package mvc.badri.spring.BadriSpringThyme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorporateService 
{
	@Autowired
	CorporateRespository repo;
	
	public Corporate saving(Corporate corp)
	{
		return repo.save(corp);
	}
}
