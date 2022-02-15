package com.project;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration      //setup the bean factory
@ComponentScan     // scan this package and sub packages
@EnableAutoConfiguration

public class SpringBootFloristApplication {
	
   public static void main(String[] args) {
		SpringApplication.run(SpringBootFloristApplication.class, args);
				}
			
}
