package com.example.demo.service;

import com.example.demo.dto.WeatherResponse;
import com.example.demo.mapper.WeatherResponseMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    public static final String HTTPS_API_TOMORROW = "https://api.tomorrow.io/v4/weather/forecast";
    public static final String KEY = "szsHvk0J5V1gEHj0Pkbz6krkhvszAoov";
    public static final String LOCATION = "42.3478,-71.0466";
    private RestTemplate restTemplate = new RestTemplate();
  //  private WeatherResponseMapper weatherResponseMapper;

    public WeatherResponse weatherResponse() throws JsonProcessingException {
        WeatherResponseMapper weatherResponseMapper = new WeatherResponseMapper();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(HTTPS_API_TOMORROW +
                "?location=" + LOCATION + "&apikey=" + KEY, String.class);
        return weatherResponseMapper.mapWeatherResponse(responseEntity.getBody());
    }

}
