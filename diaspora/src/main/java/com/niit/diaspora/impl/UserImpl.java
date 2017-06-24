package com.niit.diaspora.impl;
import com.niit.diaspora.model.User;
import com.niit.diaspora.repository.UserRepository;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserImpl implements UserRepository{
@Autowired
private SessionFactory sessionFactory;
	public void persist(User user) {
		sessionFactory.getCurrentSession().persist(user);		
	}

	public void delete(String email) {
		// TODO Auto-generated method stub
		
	}

	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
