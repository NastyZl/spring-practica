package com.example.demo.controller;

import com.example.demo.dto.WeatherResponse;
import com.example.demo.service.WeatherService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/info")
public class InfoController {
    private final WeatherService weatherService;

    public InfoController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    @PostMapping("weather")
    public ResponseEntity<WeatherResponse> weatherInfo() throws JsonProcessingException {
        return  ResponseEntity.ok(weatherService.weatherResponse());
    }
}
