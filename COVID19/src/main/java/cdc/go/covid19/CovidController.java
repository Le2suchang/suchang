package cdc.go.covid19;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cdc.go.service.CovidService;

@Controller
@RequestMapping("/")
public class CovidController {
	private static final Logger logger = LoggerFactory.getLogger(CovidController.class);
	
	@Inject
	private CovidService service;
	
	@RequestMapping(value="home", method=RequestMethod.GET)
	public void main(Model model) throws Exception{
		logger.info("show all list...");
		model.addAttribute("list", service.listAll());
	}
}
