package com.example.alenut.generateweatherdata.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.example.alenut.generateweatherdata.domain.Forecast;
import com.example.alenut.generateweatherdata.domain.WeatherData;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/forecast")
public class Controller {

  @GetMapping(value = "/{city}", produces = APPLICATION_JSON_VALUE)
  public WeatherData get(@PathVariable(name = "city") String city) {
    final List<Forecast> forecast;

    if (city.equals("Bucuresti")) {
      forecast = IntStream.rangeClosed(1, 6)
          .mapToObj(i -> new Forecast("", "", ""))
          .toList();
    } else {
      forecast = IntStream
          .rangeClosed(1, 6)
          .mapToObj(i ->
              new Forecast(String.valueOf(i), String.valueOf(ThreadLocalRandom.current().nextInt(20, 31)),
                  String.valueOf(ThreadLocalRandom.current().nextInt(30, 41))))
          .toList();
    }
    return new WeatherData("", "", "", forecast);
  }
}
