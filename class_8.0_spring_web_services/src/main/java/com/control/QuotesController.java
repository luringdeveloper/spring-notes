package com.control;




import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Quotes;

@RestController
public class QuotesController {

	@PostMapping("/insertquotes")
	public Quotes insertQuotes(@RequestBody Quotes quotes) {
		System.out.println(quotes);
		return quotes;
	}
	
	
//	public Quotes deleteQuotes() {
//		
//	}
//	
//	
//	public Quotes updateQuotes() {
//		
//	}
//	
//	
//	public Quotes fetchQuotesById() {
//		
//	}
//	
//	
//	public List<Quotes> fetchQuotesAll() {
//		
//	}
}
