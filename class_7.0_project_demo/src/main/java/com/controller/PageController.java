package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
//	@RequestMapping("/")
//	public String index() {
//		return "index";
//	}
	@RequestMapping("/")
	public ModelAndView index(ModelAndView modelAndView) {
		modelAndView.setViewName("index");
		String name="ajay";
		modelAndView.addObject("msg",name);
		return modelAndView;
	}
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
	
	@GetMapping("/upload")
	public String upload() {
		return "upload";
	}
	
}
