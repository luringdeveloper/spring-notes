package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/insert")
	public String insert() {
		return "insert";
	}
	@GetMapping("update")
	public String update() {
		return "update";
	}

	@GetMapping("/quotesbyid")
	public String quotedbyid() {
		return "quotesbyid";
	}
	
	@GetMapping("/deletequotes")
	public String deletequotes() {
		return "deletequotes";
	}
}
