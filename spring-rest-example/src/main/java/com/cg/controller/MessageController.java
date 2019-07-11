package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.MessageModel;
import com.cg.service.IMessageService;

@RestController
@RequestMapping("/home")
public class MessageController {
	@Autowired
	private IMessageService messageService;
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET, headers = "application/json")
	public MessageModel displayMessage(@PathVariable("name") String name) {
		 
		MessageModel messageModel= new MessageModel();
		messageModel.setName(name);
		return messageService.displayMessage(messageModel);
		
	}
	public void setMessageService(IMessageService messageService) {
		this.messageService = messageService;
	}

}
