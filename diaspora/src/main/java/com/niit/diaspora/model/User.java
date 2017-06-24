package com.niit.diaspora.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="User")
public class User {
	@Id
	@GeneratedValue
	@Column(name="id")
	public Integer id;
	@Column(name="name")
	public String name;
	@Column(name="email")
	public String email;
	@Column(name="password")
	public String password;
	@Column(name="confirm")
	public String confirm;
	public User(){
		super();
	}
	public User(String name, String email, String password, String confirm){
		this.name=name;
		this.email=email;
		this.password=password;
		this.confirm=confirm;		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	public String toString(){
		return id + " " + name + " " + password;
	}
}
