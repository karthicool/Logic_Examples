package com.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
@RequestMapping("/welcome")
	protected ModelAndView welcome(){
	System.out.println("inside controller");
		ModelAndView model=new ModelAndView("welcome");
		model.addObject("welcomeMessage", "Hi welcome to Spring MVC");
		return model;
	}

}
