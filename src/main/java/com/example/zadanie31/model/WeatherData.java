package com.example.zadanie31.model;

import lombok.Data;

@Data
public class WeatherData {

    private Main main;
    private Wind wind;
    private String name;
}
