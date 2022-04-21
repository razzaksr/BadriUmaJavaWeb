package mvc.badri.spring.BadriSpringThyme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CorporateController 
{
	@Autowired
	CorporateService serv;
	
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
		return "redirect:/new";
	}
}
