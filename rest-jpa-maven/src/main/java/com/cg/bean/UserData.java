package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userjpa")
public class UserData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	//@Pattern(regexp = "^[a-zA-Z]+$", message = "User first name must contain only alphabets")
	//@Size(min = 1, max = 30)
	String firstName;
	//@Pattern(regexp = "^[a-zA-Z]+$", message = "User last name must contain only alphabets")
	//@Size(min = 1, max = 30)

	String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "UserData [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
