package com.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.custom.propertyEditor.MobilePropertyEditor;
import com.model.Student;

@Controller
public class TrainingController 
{
	@RequestMapping("/applReg.htm")
	public ModelAndView requestApplication(HttpServletRequest req,HttpServletResponse resp)
	{
		ModelAndView model=new ModelAndView("trainingForm");
		//model.addObject("heading", "Training Form Test");
		return model;
	}
	
	@ModelAttribute
	public void model(Model model)
	{
		model.addAttribute("heading", "Student Training Form");
	}
  
	
	
  @RequestMapping("/submitForm.htm")
  public ModelAndView submitForm(@RequestParam("sname") String name,@RequestParam("dob") Date dob,@RequestParam("mobile") String mobile,@RequestParam("address") String address)
	{
	 // Student s=new Student(name,dob,mobile,address);
	  ModelAndView model=new ModelAndView("success");
	 // model.addObject("student", s);
	  return model;
  }
  
  @RequestMapping("/submitFormOne.htm")
  public ModelAndView submitFormMap(@RequestParam Map<String,String> map)
	{
	  
	  String name=map.get("sname");
	 // Date dob=map.get("dob");
	  String mobile=map.get("mobile");
	  String address=map.get("address");
	  
	  //System.out.println("name="+name+"---"+dob);
	  //Student s=new Student(name,dob,mobile,address);
	  ModelAndView model=new ModelAndView("success");
	 // model.addObject("student", s);
	  return model;
  }
  
  @RequestMapping("/submitFormModelAttribute.htm")
  public ModelAndView submitFormModelAttribute(@Valid @ModelAttribute("student") Student s,BindingResult binding)
	{
	  ModelAndView model=null;
	  /*@ModelAttribute features: 1. automatic binding done to model class. 2. object is added automatically to jsp page.
	   * 3.Taking out the common properties from all the request handling methods and keeping in @ModelAttribute annatated method which will be called at every request handling methods. 
	   */
	  if(binding.hasErrors())
	  {
		  model= new ModelAndView("trainingForm");  
	  }
	  else {
		  model= new ModelAndView("success");
	  }
	 // model.addObject("heading", "Training Form Test");
	  return model;
  }
  
  @InitBinder
  public void bind(WebDataBinder binder)
  {
	  SimpleDateFormat sdf=new SimpleDateFormat("DD-MM-YYYY");
	  binder.registerCustomEditor(Date.class,"dob",new CustomDateEditor(sdf, false));
	  binder.registerCustomEditor(String.class,"mobile",new MobilePropertyEditor());
  }
  
}
