package com.SpringOrmCrud.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.SpringOrm.Entities.User;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	@Qualifier("hibernateTemplate")
	HibernateTemplate template;

	@Override
	public List<User> getUsersList() {
		List<User> userList = this.template.loadAll(User.class);
		return userList;
	}

    
	
	

	
}
