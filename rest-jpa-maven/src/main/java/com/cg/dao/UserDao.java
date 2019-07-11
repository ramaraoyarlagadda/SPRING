package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.UserData;

@Repository
@Transactional
public class UserDao implements IUserDao {
	@PersistenceContext
	private EntityManager entityManager;

	public String add(UserData user) {
		entityManager.persist(user);
		return "success";
	}
	public UserData findUser(int id) {
		UserData userData = entityManager.find(UserData.class, id);
		return userData;
	}

}
