package com.repo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.SignUp;

@Repository

public class UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public int insert(SignUp signUp)  { 
	sessionFactory.getCurrentSession().save(signUp);
	return 1;
	}

	@Transactional
	public SignUp login(String email, String pwd) {
	
		SignUp signUp=sessionFactory.getCurrentSession().get(SignUp.class,email);
	
		if (signUp!=null) {
			if(signUp.getPwd().equals(pwd)) {
				return signUp;
			}
		}
		return null;
	}

	@Transactional
	public List<SignUp> getAllUser() {
		Criteria criteria=sessionFactory.getCurrentSession().createCriteria(SignUp.class);
		return criteria.list();
	}
}
