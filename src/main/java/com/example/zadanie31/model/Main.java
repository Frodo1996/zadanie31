package com.example.zadanie31.model;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class Main {

    private double temp;
    @JsonProperty("feels_like")
    private double feelsLike;
    @JsonProperty("temp_min")
    private double minTemperature;
    @JsonProperty("temp_max")
    private double maxTemperature;
    private double pressure;
    private double humidity;
}