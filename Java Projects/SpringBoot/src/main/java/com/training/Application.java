package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		Book book = ctx.getBean(Book.class);
		
		System.out.println(book);
		
		/*RestTemplate template = ctx.getBean(RestTemplate.class);
		
		String response = template.getForObject("http://localhost:3030/findAll", String.class);
		
		System.out.println(response);*/
		
		MyDataSource dataSource = ctx.getBean(MyDataSource.class);
		
		System.out.println(dataSource);
		
	}
}
