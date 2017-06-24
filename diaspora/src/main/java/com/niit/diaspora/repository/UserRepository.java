package com.niit.diaspora.repository;
import com.niit.diaspora.model.User;
import java.util.List;


public interface UserRepository {
	public void persist(User user);
	public void delete(String email);
	public User findById(Integer id);
	public User findByEmail(String email);
	public List<User> findAll();	
}
