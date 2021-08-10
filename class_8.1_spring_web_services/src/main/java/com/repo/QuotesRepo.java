package com.repo;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Quotes;

@Repository
public class QuotesRepo {
	@Autowired
	private SessionFactory sessionFactory;

	public Quotes insert(Quotes quotes) {
		sessionFactory.getCurrentSession().save(quotes);
		return quotes;
	}

	public List<Quotes> fetchQuotesAll() {
		CriteriaBuilder criteriaBuilder = sessionFactory.getCriteriaBuilder();
		CriteriaQuery<Quotes> criteriaQuery = criteriaBuilder.createQuery(Quotes.class);
		Root<Quotes> root = criteriaQuery.from(Quotes.class);
		criteriaQuery.select(root);

		Query query = sessionFactory.getCurrentSession().createQuery(criteriaQuery);
		List<Quotes> quotes = query.getResultList();
		System.out.println("query: "+query);
		return quotes;
	}
	
	public String deleteQuotes(int id) {
		Quotes quotes= fetchQuotesById(id);
		sessionFactory.getCurrentSession().delete(quotes);
		return "successful";
}

public String updateQuotes(Quotes quotes) {
	boolean b=false;
	if (b==false) {
		sessionFactory.getCurrentSession().update(quotes);
		b=true;
	}
	 
	 return (b==true)?"success":"failed";
}

public Quotes fetchQuotesById(int id) {
	
	 return sessionFactory.getCurrentSession().get(Quotes.class,id);
}

}
