package com.vitoralvesp.runnerz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RunnerzApplication {

	private static final Logger log = LoggerFactory.getLogger(RunnerzApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(RunnerzApplication.class, args);
		log.info("Spring Boot Application Started");


	}

}
