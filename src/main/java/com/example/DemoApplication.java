package com.example;

import com.example.service.MyService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(final MyService myService) {

		return strings -> myService.createDemoUsers();

	}

	@Bean
	public DataSource database() {
		return DataSourceBuilder.create()
				.url("jdbc:mysql://127.0.0.1:3306/activiti?characterEncoding=UTF-8")
				.username("root")
				.password("centling")
				.driverClassName("com.mysql.jdbc.Driver")
				.build();
	}
}
