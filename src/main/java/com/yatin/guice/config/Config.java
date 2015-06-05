package com.yatin.guice.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.yatin.guice.client.ActionClient;
import com.yatin.guice.service.EmailMessageService;
import com.yatin.guice.service.MessageService;

@Configuration
@PropertySource("classpath:testing.properties")
public class Config {

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public MessageService getMessageService() {
		return new EmailMessageService();
	}
	
	@Bean
	public ActionClient getActionClient() {
		return new ActionClient();
	}
}
