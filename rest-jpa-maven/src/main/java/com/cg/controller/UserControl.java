package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cg.bean.UserData;
import com.cg.service.UserService;

//@Controller
@RestController

public class UserControl {
	@Autowired
	private UserService service;

	public void setService(UserService service) {
		this.service = service;
	}

//	@RequestMapping(value = "/")
//	public String showIndex() {
//		System.out.println("index");
//		System.out.println("asdf");
//		return "index";
//	}
//	
//	@RequestMapping(value = "submit")
//	public ModelAndView submitForm() {
//		System.out.println("abc");
//		UserData data = new UserData();
//		return new ModelAndView("adduser", "data", data);
//	}

//	@RequestMapping(value = "add")
//	public ModelAndView user(@ModelAttribute("data") UserData userData) {
//		String rslt = service.addUser(userData.getFirstName(), userData.getLastName());
//		ModelAndView mv = new ModelAndView();
////		if (result.hasErrors()) {
////			mv.setViewName("index");
////		}
//		mv.addObject("result", rslt);
//		mv.setViewName("display");
//		return mv;
//	}
//	
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET ,produces = "application/json")
	@ResponseBody
	public  UserData getUser(@PathVariable("id") Integer userId)  {
		System.out.println(userId);
		UserData userData = service.findUser(userId);
		System.out.println(userData.getFirstName());
		return userData;
	}
	
}
