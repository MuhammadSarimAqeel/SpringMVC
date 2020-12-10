package com.springMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springMVC.model.user;
import com.springMVC.service.userservice;

@Controller
public class ContactController {
	@Autowired
	private userservice userservice;
	
    @RequestMapping("/contact")
	public String showform() {
		
		
		return "contact";
	}
    
	@RequestMapping(path="/processform", method = RequestMethod.POST)
    public String handleform(@ModelAttribute user user, Model model,BindingResult result) {
		boolean b= result.hasErrors();
    	if(b==true) {
    		model.addAttribute("b",b);
    		return "contact";
    	}
	System.out.println(user);
    	
    	this.userservice.createuser(user);
  
    	return "success";
    }
	
	
	/*
	 
		@RequestMapping(path="/processform", method = RequestMethod.POST)
	    public String handleform(@RequestParam("name") String name , @RequestParam("email") String email , @RequestParam("messege") String messege, Model model) {
	    	
			model.addAttribute("name", name);
			model.addAttribute("email", email);
			model.addAttribute("messege", messege);
	    	System.out.println(name);
	    	System.out.println(email);
	    	System.out.println(messege);
	    	
	    	
	    	return "success";
	    }
	
	*/
}
