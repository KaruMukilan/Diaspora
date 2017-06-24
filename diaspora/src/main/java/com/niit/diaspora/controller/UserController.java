package com.niit.diaspora.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.diaspora.impl.UserImpl;
import com.niit.diaspora.model.User;

@CrossOrigin(origins = {"http://localhost:8585"}, maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserImpl service;
	//@CrossOrigin(origins = {"http://localhost:8787"}, maxAge = 6000)
	@RequestMapping("register")
	public void register(HttpServletRequest request){
		String name=request.getParameter("txtUser");
		String email=request.getParameter("txtEmail");
		String password=request.getParameter("txtPassword");
		String confirm=request.getParameter("txtConfirm");
		
		service.persist(new User(name, email, password, confirm));		
		
	}

}
