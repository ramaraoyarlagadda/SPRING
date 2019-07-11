package com.cg.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDaoImpl implements IHelloDaoImpl {
	
	public String view(String fName, String lName) {
		return fName+lName;
		
	}
}
