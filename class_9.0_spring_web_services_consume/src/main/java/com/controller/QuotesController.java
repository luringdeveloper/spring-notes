package com.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.model.Quotes;
import com.services.QuotesServices;

@Controller
public class QuotesController {

	@Autowired
	private QuotesServices quotesServices;
	

	
	@GetMapping("/quotes")
	public ModelAndView getAllQuotes() {
	
	return quotesServices.getAllQuotes();
	}
	
	@PostMapping("/insertquotes")
	@ResponseBody
	public String insertquotes(Quotes quotes) {
		
//		String t=(String)req.getAttribute("tittle");
//		String d=(String)req.getAttribute("desc");
//		System.out.println("t :"+t+ "d :"+d);
//		quotes.setDescription(d);
//		quotes.setDescription(t);
		System.out.println(quotes.getTittle());
		return quotesServices.insertQuotes(quotes);
//	modelAndView.setViewName("resp");
//	modelAndView.addObject("obj", res);
//	return modelAndView;
	}
	
	@PostMapping("/updatequotes")
	@ResponseBody
	public String updatequotes(Quotes quotes ) {
		System.out.println(quotes);
		return quotesServices.updateQuotes(quotes);
	}
	
	@PostMapping("/getquotesbyid")
	public ModelAndView getQuotesById(int id,ModelAndView view) {
		System.out.println("id: "+id);
		
		Quotes quotes= quotesServices.getquotesbyid(id);
		view.setViewName("getquotesthroughid");
		view.addObject("quotes", quotes);
		return view;
	}
	
	@PostMapping("/deletequotesbyid")
	@ResponseBody
	public String deletequotes(int id) {
		return quotesServices.deletequotes(id);
	}
}
