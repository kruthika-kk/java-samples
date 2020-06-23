package com.weatherApplication.weather;

public class WeatherService {

    public WeatherService(String message) {
        super();
        this.message = message;
    }
    private final String message;
    public String getMessage() {
        return message;
    }
}
