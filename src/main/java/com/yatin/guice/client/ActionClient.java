package com.yatin.guice.client;

import org.springframework.beans.factory.annotation.Autowired;

import com.yatin.guice.service.MessageService;

public class ActionClient {
	
	@Autowired
	private MessageService service; 
	
	public void doSomething() {
		
		service.sendMessage("Action Done", "Bob");
	}

}
