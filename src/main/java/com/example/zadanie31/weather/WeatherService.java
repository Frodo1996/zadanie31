package com.example.zadanie31.weather;

import com.example.zadanie31.model.WeatherData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

public class WeatherService {

    private final String apiKey;

    public WeatherService(@Value("${owm.api.key}") String apiKey) {
        this.apiKey = apiKey;
    }

    public Optional<WeatherData> getWeatherData(String city) {

        String url = "http://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}&units=metric";

        RestTemplate restTemplate = new RestTemplate();

        WeatherData weatherData = restTemplate.getForObject(url, WeatherData.class, city, apiKey);

        return Optional.ofNullable(weatherData);
    }
}