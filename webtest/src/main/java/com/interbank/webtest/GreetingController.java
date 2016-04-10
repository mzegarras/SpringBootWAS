package com.interbank.webtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interbank.webtest.configuration.MailConfiguration;
import com.interbank.webtest.properties.MailProperties;

@RestController
public class GreetingController {
	
	 @Autowired
	    private MailConfiguration mailConfiguration;
	 
    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {
    	mailConfiguration.doAlgo();
        return "Hello, " + name + "!";
    }
} 
