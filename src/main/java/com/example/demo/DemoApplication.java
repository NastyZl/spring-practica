package com.example.demo;

import com.example.demo.dto.WeatherResponse;
import com.example.demo.service.WeatherService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(DemoApplication.class, args);
		WeatherService weatherService = new WeatherService();

		System.out.println(weatherService.weatherResponse());
	}

}
