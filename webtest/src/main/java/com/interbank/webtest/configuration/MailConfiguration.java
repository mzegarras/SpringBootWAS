package com.interbank.webtest.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.interbank.webtest.properties.MailProperties;

@Configuration
@EnableConfigurationProperties(MailProperties.class) 
public class MailConfiguration {
	
	
	@Autowired
    private MailProperties mailProperties;
	
	public void doAlgo(){
		System.out.println(mailProperties.getHost());
	}

}
