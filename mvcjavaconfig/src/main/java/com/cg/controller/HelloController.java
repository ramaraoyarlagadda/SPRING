package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.service.HelloService;

@RestController
@RequestMapping("welcome")
public class HelloController {

	@Autowired
	private HelloService service;

	public void setService(HelloService service) {
		this.service = service;
	}

	@RequestMapping("/hello")
	public ModelAndView hello(@RequestParam("text1") String firstName, @RequestParam("text2") String lastName) {
		String fullname = service.viewService(firstName, lastName);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("fullname", fullname);
		modelAndView.setViewName("fullname.jsp");
		return modelAndView;

	}

}
