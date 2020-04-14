package com.org.prototype.example;

import com.springsocial.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableConfigurationProperties(AppProperties.class)
public class PrototypeTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrototypeTemplateApplication.class, args);
	}

}
