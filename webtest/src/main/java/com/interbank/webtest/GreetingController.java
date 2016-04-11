package com.interbank.webtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interbank.webtest.configuration.MailConfiguration;
import com.interbank.webtest.properties.MailProperties;

@RestController
public class GreetingController {

	private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);

	@Autowired
	private MailConfiguration mailConfiguration;

	@Autowired
	private CounterService counterService;
	
	

	

	@RequestMapping("/hello/{name}")
	String hello(@PathVariable String name) {
		mailConfiguration.doAlgo();

		// some code
		LOGGER.debug("Test debug: {}", name);

		counterService.increment("services.system.myservice.invoked");
		
		try {
			Thread.sleep(1000 * 12);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "Hello, " + name + "!";
	}
}
