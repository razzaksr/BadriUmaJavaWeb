package mvc.badri.spring.BadriSpringThyme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CorporateController 
{
	@Autowired
	CorporateService serv;
	
	@RequestMapping(path="/remove/{week}",method=RequestMethod.GET)
	public String rem(Model model,@PathVariable("week") int week)
	{
		model.addAttribute(serv.erasing(week));
		return "redirect:/home";
	}
	
	@RequestMapping(path="/up",method=RequestMethod.PUT)
	public String heyTheres(Model model,Corporate object)
	{
		model.addAttribute("info", serv.saving(object).getCorpName()+" has Updated");
		return "redirect:/home";
	}
	
	@RequestMapping("/edit/{week}")
	public String editing(Model model,@PathVariable("week") int week)
	{
		System.out.println(serv.gettingOneObj(week));
		model.addAttribute("obj", serv.gettingOneObj(week));
		return "Update";
	}
	
	@RequestMapping("/read/{week}")
	public String readie(Model model,@PathVariable("week") int week)
	{
		System.out.println(serv.gettingOneObj(week));
		model.addAttribute("obj", serv.gettingOneObj(week));
		return "Read";
	}
	
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String homie(Model model)
	{
		model.addAttribute("every", serv.listing());
		return "Home";
	}
	
	@RequestMapping(path = "/new",method = RequestMethod.GET)
	public String haiThere(Model model)
	{
		Corporate corp=new Corporate();
		model.addAttribute("object",corp);
		return "NewCorporate";
	}
	
	@RequestMapping(path="/send",method=RequestMethod.POST)
	public String heyThere(Model model,Corporate object)
	{
		model.addAttribute("info", serv.saving(object).getCorpName()+" has Added");
		return "redirect:/home";
	}
}
