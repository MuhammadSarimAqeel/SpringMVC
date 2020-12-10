package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("this is one handle");
		
		return "redirect:/two";
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is Second handler");
	
		return "";
	}
	
}
