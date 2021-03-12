package br.com.fev02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@Configuration(proxyBeanMethods = false)
@EnableAutoConfiguration
@EnableSpringDataWebSupport
@SpringBootApplication
public class Fev02Application {
	

	public static void main(String[] args) {
		SpringApplication.run(Fev02Application.class, args);
		
	}
  
}
