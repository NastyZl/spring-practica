package com.example.demo.dto;

public class WeatherResponse {
    private String LOCATION;
    private Double AVERAGE_MIN;
    private Double AVERAGE_HOUR;
    private Double AVERAGE_DAY;

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "LOCATION='" + LOCATION + '\'' +
                ", AVERAGE_MIN=" + AVERAGE_MIN +
                ", AVERAGE_HOUR=" + AVERAGE_HOUR +
                ", AVERAGE_DAY=" + AVERAGE_DAY +
                '}';
    }

    public WeatherResponse(String LOCATION, Double AVERAGE_MIN, Double AVERAGE_HOUR, Double AVERAGE_DAY) {
        this.LOCATION = LOCATION;
        this.AVERAGE_MIN = AVERAGE_MIN;
        this.AVERAGE_HOUR = AVERAGE_HOUR;
        this.AVERAGE_DAY = AVERAGE_DAY;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public void setLOCATION(String LOCATION) {
        this.LOCATION = LOCATION;
    }

    public Double getAVERAGE_MIN() {
        return AVERAGE_MIN;
    }

    public void setAVERAGE_MIN(Double AVERAGE_MIN) {
        this.AVERAGE_MIN = AVERAGE_MIN;
    }

    public Double getAVERAGE_HOUR() {
        return AVERAGE_HOUR;
    }

    public void setAVERAGE_HOUR(Double AVERAGE_HOUR) {
        this.AVERAGE_HOUR = AVERAGE_HOUR;
    }

    public Double getAVERAGE_DAY() {
        return AVERAGE_DAY;
    }

    public void setAVERAGE_DAY(Double AVERAGE_DAY) {
        this.AVERAGE_DAY = AVERAGE_DAY;
    }
}
