package com.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/master")
public class LoginController {

	@RequestMapping("/Login")
	protected ModelAndView welcome(){
	System.out.println("inside LoginController");
		ModelAndView model=new ModelAndView("login");
		return model;
	}
}
