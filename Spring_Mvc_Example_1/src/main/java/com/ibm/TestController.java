package com.ibm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController 
{
  @RequestMapping("/hello")
  public ModelAndView helloWorld()
  {
	 String message="Hello Guys : Welcome to Spring Training";
	 return new ModelAndView("hellopage", "message", message);
  }
  
  @RequestMapping("/welcome")
  public ModelAndView welcomeWorld()
  {
	  String message= "Welcome to Spring";
	  return new ModelAndView("welcomepage", "message", message);
  }
}
