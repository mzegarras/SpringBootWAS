package com.interbank.webtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.integration.jmx.config.EnableIntegrationMBeanExport;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@Configuration
@EnableWebMvc
@ComponentScan
@EnableAutoConfiguration
//@ComponentScan({"net.msonic.pos.ws.*"})
@EnableConfigurationProperties

public class Application extends SpringBootServletInitializer  implements WebApplicationInitializer{
		
	
	
	 public static void main(String[] args) {
	        SpringApplication.run(applicationClass, args);
	    }

	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(applicationClass);
	    }

	    private static Class<Application> applicationClass = Application.class;
}


