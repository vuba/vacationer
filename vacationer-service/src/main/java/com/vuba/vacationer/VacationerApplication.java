package com.vuba.vacationer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class VacationerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VacationerApplication.class, args);
	}

}
