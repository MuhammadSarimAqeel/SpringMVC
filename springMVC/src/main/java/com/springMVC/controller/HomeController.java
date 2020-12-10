package com.springMVC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
     @RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "Sarim aqeel");
	return "index";	
	}
     @RequestMapping("/about")
     public String about() {
    	 System.out.println("This is about url");
    	 
    	 return "about";
     }
    @RequestMapping("/help")
     public ModelAndView help() {
    	 ModelAndView mv = new ModelAndView();
    	 mv.addObject("name", "John");
    	 List<Integer> list = new ArrayList<Integer>();
    	 list.add(60);
    	 list.add(70);
    	 list.add(57);
    	 mv.addObject("marks", list);
    	 
    	 mv.setViewName("help");
    	 System.out.println("This is help url");
    	 return mv ;
     }
    
}
