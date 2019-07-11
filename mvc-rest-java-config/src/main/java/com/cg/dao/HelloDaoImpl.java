package com.cg.dao;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloDaoImpl implements IHelloDaoImpl {
	
	public String view(String fName, String lName) {
		return fName+lName;
		
	}
}
