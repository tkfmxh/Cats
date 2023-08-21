package kor.cats.legacy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();mv.setViewName("/board/content"); // ���� �̸�
		
	    mv.addObject("data", "12341234");
	    
		mv.setViewName("/main/main");
		return mv;
	}
	
}
