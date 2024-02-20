package com.example.demo.mapper;

import com.example.demo.dto.WeatherResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class WeatherResponseMapper {
    private final ObjectMapper jsonParser = new ObjectMapper();

    public WeatherResponse mapWeatherResponse(String json) throws JsonProcessingException {
        JsonNode jsonNode = jsonParser.readTree(json);
        return new WeatherResponse(getLocation(jsonNode),
                getAverageTemperatures(jsonNode, "minutely", "temperature"),
                getAverageTemperatures(jsonNode, "hourly", "temperature"),
                getAverageTemperatures(jsonNode, "daily", "temperatureAvg")
        );
    }
    private Double getAverageTemperatures(JsonNode jsonNode, String range, String nodeName) {
        return jsonNode.get("timelines").get(range).findValues(nodeName)
                .stream()
                .mapToDouble(a -> Double.parseDouble(a.asText())).average().getAsDouble();
    }
    private  String getLocation(JsonNode jsonNode) {
        return jsonNode.get("location").toString();
    }

}
