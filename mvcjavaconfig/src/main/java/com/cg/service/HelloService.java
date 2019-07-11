package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.HelloDaoImpl;
@Service
public class HelloService implements IHelloService{
	@Autowired
	private HelloDaoImpl helloDaoImpl;

	public void setHelloDaoImpl(HelloDaoImpl helloDaoImpl) {
		this.helloDaoImpl = helloDaoImpl;
	}

	public String viewService(String fName,String lName) {
		
		return helloDaoImpl.view(fName, lName);
		
	}
	

}
