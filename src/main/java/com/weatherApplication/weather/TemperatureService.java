package com.weatherApplication.weather;

public class TemperatureService {

    public TemperatureService(float value) {
        super();
        this.value = value;
    }
    private final float value;
    public float getValue() {
        return value;
    }
}
