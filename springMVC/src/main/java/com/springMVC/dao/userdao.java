package com.springMVC.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springMVC.model.user;
@Repository
public class userdao {
	
	@Autowired
 private HibernateTemplate hibernatetemplate;
	
	@Transactional
	public int save(user user) {
		
	int id = (Integer)this.hibernatetemplate.save(user);
	
		return id;
	}
	
}
