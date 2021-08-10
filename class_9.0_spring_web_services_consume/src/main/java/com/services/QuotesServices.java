package com.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.model.Quotes;

@Service
public class QuotesServices {

	@Autowired
	private RestTemplate restTemplate;

	private HttpHeaders headers = new HttpHeaders();

	private String insert_quotes = "http://localhost:8287/class_8.1_spring_web_services/insertquotes";
	private String delete_quotes = "http://localhost:8287/class_8.1_spring_web_services/deletequotes/";
	private String update_quotes = "http://localhost:8287/class_8.1_spring_web_services/updatequotes";
	private String get_quotes_by_id = "http://localhost:8287/class_8.1_spring_web_services/fetchquotesbyid/";
	private String get_quotes_all = "http://localhost:8287/class_8.1_spring_web_services/fetchquotesall";

	public ModelAndView getAllQuotes() {

		ModelAndView modelAndView = new ModelAndView();
		List<Quotes> list = restTemplate.getForObject(get_quotes_all, List.class);
		System.out.println("list :" + list);
		List<Quotes> quotes = new ArrayList<Quotes>();
		try {
			JSONArray jsonArray = new JSONArray(list);
			System.out.println("jsonarray :" + jsonArray);
			for (int i = 0; i < jsonArray.length(); i++) {
				System.out.println(new Gson().fromJson(jsonArray.getJSONObject(i).toString(), Quotes.class));
				quotes.add(new Gson().fromJson(jsonArray.getJSONObject(i).toString(), Quotes.class));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		modelAndView.addObject("quotes", quotes);
		modelAndView.setViewName("quoteslist");
		return modelAndView;
	}

	public String insertQuotes(Quotes quotes) {
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(new Gson().toJson(quotes), headers);
		return restTemplate.postForObject(insert_quotes, entity, String.class);
	}

	public String updateQuotes(Quotes quotes) {
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(new Gson().toJson(quotes), headers);
		// restTemplate.put(update_quotes, entity, String.class);
		return restTemplate.exchange(update_quotes, HttpMethod.PUT, entity, String.class).getBody();

	}
	public Quotes getquotesbyid(int id) {
		
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		HttpEntity<String> entity = new HttpEntity<String>(new Gson().toJson(id), headers);
//		System.out.println("url is :"+get_quotes_by_id+entity);
//		//restTemplate.getForObject(get_quotes_by_id, entity,Quotes.class);
//		return restTemplate.exchange(get_quotes_by_id,HttpMethod.GET,entity,Quotes.class).getBody();
//	
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		return restTemplate.exchange(get_quotes_by_id+"/"+id, HttpMethod.GET,entity, Quotes.class).getBody();

	}
	public String deletequotes(int id) {
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		HttpEntity<String> entity = new HttpEntity<String>(new Gson().toJson(id), headers);
//		System.out.println("url is :"+delete_quotes+entity);
//		return restTemplate.exchange(delete_quotes,HttpMethod.DELETE,entity, String.class).getBody();
		
		
		//rest.delete(Constant.DELETE_BOOK + "/" + id);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<String> response = restTemplate.exchange(delete_quotes+"/"+id, HttpMethod.DELETE,entity, String.class);
		System.out.println(response);
		return response.getBody();

	}
}
