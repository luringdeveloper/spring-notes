package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.Quotes;
import com.repo.QuotesRepo;

@Service
public class QuotesServices {

	@Autowired
	private QuotesRepo quotesRepo;

	@Transactional
	public String insertQuotes(Quotes quotes) {
		try {
			if (quotes != null) {
				quotesRepo.insert(quotes);
				return "successfull insert";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "not insert";
	}

	@Transactional
	public List<Quotes> fecthQuotesAll() {
		List<Quotes> quotes;
		try {

			quotes = quotesRepo.fetchQuotesAll();

		} catch (Exception e) {
			quotes = null;
		}
		return quotes;
	}

	@Transactional
	public String deleteQuotes(int id) {
		try {

			return quotesRepo.deleteQuotes(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "not successful";

	}

	@Transactional
	public String updateQuotes(Quotes quotes) {
		return quotesRepo.updateQuotes(quotes);
	}

	@Transactional
	public Quotes fetchQuotesById(int id) {
		Quotes quotes = null;
		try {
			
			return quotes=quotesRepo.fetchQuotesById(id);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return quotes;

	}

}
