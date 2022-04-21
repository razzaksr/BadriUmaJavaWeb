package mvc.badri.spring.BadriSpringThyme;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//save,findById,findAll,delete

@Repository
public interface CorporateRespository extends CrudRepository<Corporate, Integer> 
{
	
}
