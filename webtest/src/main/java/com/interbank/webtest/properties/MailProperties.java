package com.interbank.webtest.properties;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConfigurationProperties(locations = "classpath:mail.properties", ignoreUnknownFields = false, prefix = "mail")
@ConfigurationProperties(locations = "file:/Proyectos/Apps/config/mail-${spring.profiles.active}.yml", ignoreUnknownFields = false, prefix = "mail")
public class MailProperties {

    public static class Smtp {

        private boolean auth;
        private boolean starttlsEnable;
		public boolean isAuth() {
			return auth;
		}
		public void setAuth(boolean auth) {
			this.auth = auth;
		}
		public boolean isStarttlsEnable() {
			return starttlsEnable;
		}
		public void setStarttlsEnable(boolean starttlsEnable) {
			this.starttlsEnable = starttlsEnable;
		}

        	
    }

    @NotBlank
    private String host;
    private int port;  
    private String from;
    private String username;
    private String password;
    @NotNull
    private Smtp smtp;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Smtp getSmtp() {
		return smtp;
	}
	public void setSmtp(Smtp smtp) {
		this.smtp = smtp;
	}

    

}