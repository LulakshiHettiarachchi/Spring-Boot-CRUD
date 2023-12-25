package com.example.sample_project;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args);
	}
	@Bean
	public ModelMapper ModelMapper(){
		return new ModelMapper();
	}
}
