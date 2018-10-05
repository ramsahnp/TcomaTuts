package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
// @EnableWebMvc
@RequestMapping("welcome")
public class WelcomeController 
{
	@RequestMapping("/hello.html/{username}/{city}")
	public ModelAndView helloRequest(@PathVariable("username") String name,@PathVariable("city") String city)
	{
		ModelAndView model=new ModelAndView("display");
		model.addObject("msg", "Hello"+name+"from "+city);
		return model;
		
	}
	
	@RequestMapping("/welcome.html/{username}/{city}/{pincode}/{college}")
	public ModelAndView welcomeRequest(@PathVariable Map<String,String> pathvariable)
	{
		String un=pathvariable.get("username");
		String city=pathvariable.get("city");
		String pin=pathvariable.get("pincode");
		String college=pathvariable.get("college");
		ModelAndView model=new ModelAndView("display");
		model.addObject("msg","Welcome"+un+"from"+city+" pincode="+pin+" colleger name is"+ college);
		return model;
		
	}
	

}
