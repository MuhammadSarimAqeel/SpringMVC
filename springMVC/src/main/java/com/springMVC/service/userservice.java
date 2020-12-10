package com.springMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMVC.dao.userdao;
import com.springMVC.model.user;
@Service
public class userservice {
	
	@Autowired
	private userdao userdao;
 public int createuser(user user) {
	 
	 int id = (Integer) this.userdao.save(user);
	 
	 return id;
 }
}
