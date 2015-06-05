package com.yatin.guice.service;

import org.springframework.beans.factory.annotation.Value;

public class EmailMessageService implements MessageService {

	@Value("service.host")
	private String host;

	@Value("service.url")
	private String url;
		
	@Override
	public boolean sendMessage(String message, String userName) {
		
		System.out.println("Email Service message:" + message + " username:" +  userName);
		System.out.println("Email Service message:" + host);
		System.out.println("Email Service message:" + url);
		
		return true;
	}

}
