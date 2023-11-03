package com.example.alenut.generateweatherdata.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherData {

  private String temperature;
  private String wind;
  private String description;
  private List<Forecast> forecast;
}
