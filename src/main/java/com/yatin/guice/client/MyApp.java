package com.yatin.guice.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yatin.guice.config.Config;

public class MyApp {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		ActionClient client = ctx.getBean(ActionClient.class);
		
		client.doSomething();
	}
}
