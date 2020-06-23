package com.weatherApplication.weather;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class WeatherController {
    private static final String welcomemsg = "Welcome to Weather Information by %s";
    @GetMapping("/welcome/user")
    @ResponseBody
    public WeatherService WeatherService(@RequestParam(name="name", required=false, defaultValue="Kruthika") String name) {
        return new WeatherService(String.format(welcomemsg, name));
    }
}