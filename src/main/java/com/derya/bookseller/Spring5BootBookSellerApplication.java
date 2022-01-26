package com.derya.bookseller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.pofiles.active:default}.properties")
public class Spring5BootBookSellerApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(Spring5BootBookSellerApplication.class, args);
	}

}
