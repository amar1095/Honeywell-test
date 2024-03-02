package com.example.honeywell.HoneyWell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.honeywell.HoneyWell.Entity.City;
import com.example.honeywell.HoneyWell.service.CityService;

import java.io.IOException;
import java.util.List;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/getAllCities")
    public List<City> getCities() throws IOException {
        return cityService.getAllCities();
    }
    
    @GetMapping("/findPath")
    public List<String> findPath(@RequestParam String city1, @RequestParam String city2) {
        return cityService.findPathBetweenCities(city1, city2);
    }
}


