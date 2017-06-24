package com.niit.diaspora.impl;
import com.niit.diaspora.model.User;
import com.niit.diaspora.repository.UserRepository;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserImpl implements UserRepository{
@Autowired
private SessionFactory sessionFactory;
	@Override
	public void persist(User user) {
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(user);
		s.getTransaction().commit();
		s.close();
	}
	@Override
	public void delete(String email) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
