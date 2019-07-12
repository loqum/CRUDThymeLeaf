package com.rfm.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.rfm")
@EnableJpaRepositories(basePackages = "com.rfm.repository")
@EnableTransactionManagement
@EntityScan(basePackages = "com.rfm.entity")
public class CrudThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudThymeleafApplication.class, args);
	}

}
