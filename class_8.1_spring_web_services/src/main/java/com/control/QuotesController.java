package com.control;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Quotes;
import com.services.QuotesServices;

@RestController
public class QuotesController {

	@Autowired
	QuotesServices quotesServices;
	
	@PostMapping("/insertquotes")
	public String insertQuotes(@RequestBody Quotes quotes) {
		return quotesServices.insertQuotes(quotes) ;
	}
	
	@DeleteMapping("/deletequotes/{id}")
	public String deleteQuotes(@PathVariable() int id) {
		return quotesServices.deleteQuotes(id);
	}
	
//	@DeleteMapping("/deletequotes")
//	public String deleteQuotes(@RequestParam int id) {
//		return quotesServices.deleteQuotes(id);
//	}
	
	@PutMapping("/updatequotes")
	public String updateQuotes(@RequestBody Quotes quotes) {
		return quotesServices.updateQuotes(quotes);
	}

	@GetMapping("/fetchquotesbyid/{id}")
	public Quotes fetchQuotesById(@PathVariable() int id) {
		System.out.println("id :"+id);
		return quotesServices.fetchQuotesById(id);
	}
	
	@GetMapping("/fetchquotesall")
	public List<Quotes> fetchQuotesAll() {
		return quotesServices.fecthQuotesAll();
	}
}
