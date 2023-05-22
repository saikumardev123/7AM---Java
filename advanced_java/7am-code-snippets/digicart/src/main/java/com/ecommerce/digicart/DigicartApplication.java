package com.ecommerce.digicart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages ={"com.ecommerce.digitcart"})
@EntityScan(basePackages = {"com.ecommerce.digitcart.model"})
@SpringBootApplication
public class DigicartApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigicartApplication.class, args);
	}

}
