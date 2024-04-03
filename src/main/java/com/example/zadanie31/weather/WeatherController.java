package com.example.zadanie31.weather;

import com.example.zadanie31.model.WeatherData;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/weather")
    public String showWeatherStats(@RequestParam String city, Model model) {

        Optional<WeatherData> weatherData = weatherService.getWeatherData(city);

        if (weatherData.isPresent()) {
            model.addAttribute("weatherData", weatherData.get());
            return "weather";
        } else {
            return "redirect:/";
        }
    }
}
