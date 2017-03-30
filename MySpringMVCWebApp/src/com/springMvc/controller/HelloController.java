package com.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/master")
public class HelloController{
@RequestMapping("/welcome")
	protected ModelAndView welcome(){
	System.out.println("inside controller");
		ModelAndView model=new ModelAndView("welcome");
		model.addObject("welcomeMessage", "Hi welcome to Spring MVC");
		return model;
	}
@RequestMapping("/studDetails/{username}/{company}")
protected ModelAndView studDetails(@PathVariable("username")String name,@PathVariable("company")String cmpny){
System.out.println("inside details");
	ModelAndView model=new ModelAndView("studDetails");
	model.addObject("studentDetails", "Find the details below");
	model.addObject("username", name);
	model.addObject("company", cmpny);
	return model;
}

}
