package com.alexwestcott.gradlenonsense.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @GetMapping("/forecast")
    public ResponseEntity<String> getWeatherForecast(@RequestParam String location){

        System.out.println("Forecast requested for: " + location);

        return ResponseEntity.ok("sunny");

    }

}
