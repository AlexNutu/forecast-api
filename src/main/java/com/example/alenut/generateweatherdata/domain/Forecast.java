package com.example.alenut.generateweatherdata.domain;


import lombok.Data;

@Data
public class Forecast {

  private String day;
  private String temperature;
  private String wind;

  public Forecast(String day, String temperature, String wind) {
    this.day = day;
    this.temperature = temperature;
    this.wind = wind;
  }

}
