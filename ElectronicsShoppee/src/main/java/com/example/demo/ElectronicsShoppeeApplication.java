package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;




@SpringBootApplication
@OpenAPIDefinition
public class ElectronicsShoppeeApplication{

	public static void main(String[] args) {
		SpringApplication.run(ElectronicsShoppeeApplication.class, args);
	}
}
