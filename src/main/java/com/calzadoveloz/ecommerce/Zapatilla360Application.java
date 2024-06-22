package com.calzadoveloz.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Zapatilla360Application {

	public static void main(String[] args) {
		SpringApplication.run(Zapatilla360Application.class, args);
	}

}
