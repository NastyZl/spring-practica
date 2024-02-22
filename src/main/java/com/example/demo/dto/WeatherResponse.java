package com.example.demo.dto;

public class WeatherResponse {
    private Location LOCATION;
    private double AVERAGE_MINUTELY;
    private double AVERAGE_HOURLY;
    private double AVERAGE_DAILY;

    public WeatherResponse(Location LOCATION, double AVERAGE_MINUTELY, double AVERAGE_HOURLY, double AVERAGE_DAILY) {
        this.LOCATION = LOCATION;
        this.AVERAGE_MINUTELY = AVERAGE_MINUTELY;
        this.AVERAGE_HOURLY = AVERAGE_HOURLY;
        this.AVERAGE_DAILY = AVERAGE_DAILY;
    }

    public Location getLOCATION() {
        return LOCATION;
    }

    public void setLOCATION(Location LOCATION) {
        this.LOCATION = LOCATION;
    }

    public double getAVERAGE_MINUTELY() {
        return AVERAGE_MINUTELY;
    }

    public void setAVERAGE_MINUTELY(double AVERAGE_MINUTELY) {
        this.AVERAGE_MINUTELY = AVERAGE_MINUTELY;
    }

    public double getAVERAGE_HOURLY() {
        return AVERAGE_HOURLY;
    }

    public void setAVERAGE_HOURLY(double AVERAGE_HOURLY) {
        this.AVERAGE_HOURLY = AVERAGE_HOURLY;
    }

    public double getAVERAGE_DAILY() {
        return AVERAGE_DAILY;
    }

    public void setAVERAGE_DAILY(double AVERAGE_DAILY) {
        this.AVERAGE_DAILY = AVERAGE_DAILY;
    }
}
