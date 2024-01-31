package com.SpringOrmCrud.Dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.SpringOrm.Entities.User;


public class UserDaoImpl implements UserDao {

	@Autowired
	@Qualifier("hibernateTemplate")
	HibernateTemplate template;
	
	@Transactional
	public void insert(User user) {

		this.template.save(user);
	}

	
}
