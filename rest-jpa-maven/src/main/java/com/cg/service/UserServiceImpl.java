package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.UserData;
import com.cg.dao.IUserDao;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	IUserDao userDao;

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public String addUser(String fname, String lname) {
		UserData user = new UserData();
		user.setFirstName(fname);
		user.setLastName(lname);
		return userDao.add(user);
	}

	public UserData findUser(int id) {

		return userDao.findUser(id);
	}

}
