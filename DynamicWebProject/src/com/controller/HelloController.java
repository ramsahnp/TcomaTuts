package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.Controller;

/*public class HelloController implements Controller 
{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView model=new ModelAndView("display");
		model.addObject("msg", "Welcome to Spring MVC Projects !");
		
		return model;
	}
*/
@org.springframework.stereotype.Controller
@RequestMapping("hello")
public class HelloController
{
	@RequestMapping("/hello.html")
	public ModelAndView helloRequest(HttpServletRequest req,HttpServletResponse resp)
	{
		ModelAndView model=new ModelAndView("display");
		model.addObject("msg", "Say Hello to Spring MVC Projects !");
		return model;
		
	}
	
	@RequestMapping("/welcome.html")
	public ModelAndView welcomeRequest(HttpServletRequest req,HttpServletResponse resp)
	{
		ModelAndView model=new ModelAndView("display");
		model.addObject("msg", "Welcome to Spring MVC Projects !");
		return model;
		
	}
	

}
