package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.Controller;

import com.hib.dao.UserDao;
import com.model.Student;
import com.model.User;

import antlr.collections.List;

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
	
	@RequestMapping("/multipleselect.html")
	public ModelAndView multipleSelect(HttpServletRequest req,HttpServletResponse resp)
	{
		ModelAndView model=new ModelAndView("multipleSelect");
		//model.addObject("msg", "Say Hello to Spring MVC Projects !");
		return model;
		
	}
	
	
	@RequestMapping("/multipleselect1.html")
	public ModelAndView multipleSelect1(HttpServletRequest req,HttpServletResponse resp)
	{
		ModelAndView model=new ModelAndView("multipleSel");
		//model.addObject("msg", "Say Hello to Spring MVC Projects !");
		return model;
		
	}
	
	
	
	@RequestMapping("/hello.html")
	public ModelAndView helloRequest(HttpServletRequest req,HttpServletResponse resp)
	{
		ModelAndView model=new ModelAndView("display");
		model.addObject("msg", "Say Hello to Spring MVC Projects !");
		return model;
		
	}
	
	@RequestMapping("/request.reg")
	public ModelAndView dispREgisterPage(HttpServletRequest req,HttpServletResponse resp)
	{
		ModelAndView model=new ModelAndView("index");
		ArrayList list=new ArrayList();
		list.add("Student1");
		list.add("Student2");
		list.add("Student3");
		list.add("Student4");
		list.add("Student5");
		list.add("Student6");
		list.add("Student7");
		list.add("Student8");
		list.add("Student9");
		list.add("Student10");
		list.add("Student11");
		list.add("Student12");
		list.add("Student13");
		
		
		model.addObject("list", list);
		return model;
		
	}
	@RequestMapping("/register.jsp")
	  public ModelAndView submitFormModelAttribute(@ModelAttribute("User") User s)
		{
		System.out.println("Hitting register.jsp");
		  ModelAndView model=null;
		  /*@ModelAttribute features: 1. automatic binding done to model class. 2. object is added automatically to jsp page.
		   * 3.Taking out the common properties from all the request handling methods and keeping in @ModelAttribute annatated method which will be called at every request handling methods. 
		   */
		  
		
			  UserDao.register(s);
			  System.out.println("#### gng to save register data...");
			  model= new ModelAndView("register");
		  
		 // model.addObject("heading", "Training Form Test");
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
