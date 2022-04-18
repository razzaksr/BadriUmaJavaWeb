package mvc.badri.spring.BadriSpringThyme;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorporateRespository extends CrudRepository<Corporate, Integer> 
{
	
}
