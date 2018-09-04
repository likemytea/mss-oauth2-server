package com.chenxing.mssoauth2server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer
@RestController
public class MssOauth2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MssOauth2ServerApplication.class, args);
	}
}
