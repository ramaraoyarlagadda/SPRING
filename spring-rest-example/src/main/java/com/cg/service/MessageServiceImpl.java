package com.cg.service;

import org.springframework.stereotype.Service;

import com.cg.model.MessageModel;

@Service
public class MessageServiceImpl implements IMessageService {
public MessageModel displayMessage(MessageModel messageModel ) {
		
		return messageModel ;
	}

}
