package com.syntaxerror;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.syntaxerror")
public class TaxiRebuildApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxiRebuildApplication.class, args);
	}

}
