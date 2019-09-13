package com.org.prototype.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PrototypeTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrototypeTemplateApplication.class, args);
	}

}
