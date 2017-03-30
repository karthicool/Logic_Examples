package com.springMvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springMvc.bean.Student;

@Controller
@RequestMapping("/master")
public class StudentController {
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		binder.setDisallowedFields(new String[] {"uname"});
	}
	@RequestMapping("/StudentForm")
	protected ModelAndView getDetails(@RequestParam Map<String,String> reqParams){
	System.out.println("inside StudentController"); 
		ModelAndView model=new ModelAndView("studDetails");
		model.addObject("studentDetails", "Find the details below");
		model.addObject("username", reqParams.get("uname"));
		model.addObject("company", reqParams.get("cmpny"));
		model.addObject("pwd", reqParams.get("pwd"));
		return model;
	}
	@RequestMapping("/StudentFormModel")
	protected ModelAndView getModDetails(@ModelAttribute("s1")Student stud){
		System.out.println("inside StudentController"); 
		System.out.println("username is"+stud.getUname());
			ModelAndView model=new ModelAndView("studDetails");
			model.addObject("studentDetails", "Find the details below");
			return model;
		}
}
