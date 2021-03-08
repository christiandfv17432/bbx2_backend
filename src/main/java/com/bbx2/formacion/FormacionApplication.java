package com.bbx2.formacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FormacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormacionApplication.class, args);
	}

	@GetMapping
	public String hello (){
		return "hello";
	}
}
