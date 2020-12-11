package com.alexwestcott.gradlenonsense.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WeatherControllerTest {

    @Autowired
    private WeatherController weatherController;

    @Test
    public void shouldReturnForecastForGivenLocation() {

        String location = "Manchester";

        ResponseEntity<String> expectedResponse = ResponseEntity.ok("sunny");

        assertThat(weatherController.getWeatherForecast(location)).isEqualTo(expectedResponse);

    }


}