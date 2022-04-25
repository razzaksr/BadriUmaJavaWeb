package mvc.badri.spring.BadriSpringThyme;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebserviceController 
{
	@Autowired
	CorporateService serv;
	
	@PutMapping("/")
	public Corporate changingOndru(@RequestBody Corporate corporate)
	{
		return serv.saving(corporate);
	}
	@PutMapping(path = "/xml",consumes = "application/xml")
	public Corporate changingOndruAsXML(@RequestBody Corporate corporate)
	{
		return serv.saving(corporate);
	}
	
	@PostMapping("/")
	public Corporate addingOndru(@RequestBody Corporate corporate)
	{
		return serv.saving(corporate);
	}
	@PostMapping(path = "/xml",consumes = "application/xml")
	public Corporate addingOndruAsXML(@RequestBody Corporate corporate)
	{
		return serv.saving(corporate);
	}
	
	@DeleteMapping("/{key}")
	public String deletingOndru(@PathVariable("key") int key)
	{
		return serv.erasing(key);
	}
	@DeleteMapping(path = "/xml/{key}",produces = "application/xml")
	public String deletingOndruAsXML(@PathVariable("key") int key)
	{
		return serv.erasing(key);
	}
	
	@GetMapping("/{key}")
	public Corporate fetchingOndru(@PathVariable("key") int key)
	{
		return serv.gettingOneObj(key);
	}
	@GetMapping(path = "/xml/{key}",produces = "application/xml")
	public Corporate fetchingOndruAsXML(@PathVariable("key") int key)
	{
		return serv.gettingOneObj(key);
	}
	
	@GetMapping("/")
	public List<Corporate> fetchingEvery()
	{
		return serv.listing();
	}
	@GetMapping(path = "/xml",produces = "application/xml")
	public List<Corporate> fetchingEveryAsXML()
	{
		return serv.listing();
	}
	
}
