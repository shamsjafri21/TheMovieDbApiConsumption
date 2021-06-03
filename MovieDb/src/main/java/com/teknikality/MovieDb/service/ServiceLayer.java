package com.teknikality.MovieDb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ServiceLayer {
	
	//@Value("${api.key}")
	@Value("${api.key}")
	private String apikey;
	
	
	private final RestTemplate restTemplate;
	
	@Autowired
	public ServiceLayer(RestTemplate restTemplate) {
		
		this.restTemplate=restTemplate;
	}
	
	public String consumeApi(String movieId) {
		
		 return restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" +apikey, String.class);
		}

}
