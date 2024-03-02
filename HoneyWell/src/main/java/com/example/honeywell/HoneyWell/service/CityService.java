package com.example.honeywell.HoneyWell.service;

import com.example.honeywell.HoneyWell.Entity.City;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {
 public List<City> getAllCities() throws IOException {
     ObjectMapper mapper = new ObjectMapper();
     List<City> cities = mapper.readValue(new URL("https://gist.githubusercontent.com/dastagirkhan/00a6f6e32425e0944241/raw/33ca4e2b19695b2b93f490848314268ed5519894/gistfile1.json"),
    		 new TypeReference<List<City>>() {});
     return cities;
 }

public List<String> findPathBetweenCities(String city1, String city2) {
	List<String> al=new ArrayList<String>();
	al.add("mumbai");
	al.add("delhi");
	// here we can write logic to find shotest path
	return al;
}

}
