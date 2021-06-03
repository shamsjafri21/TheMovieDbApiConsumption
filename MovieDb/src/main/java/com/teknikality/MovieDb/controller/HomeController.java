package com.teknikality.MovieDb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.teknikality.MovieDb.service.ServiceLayer;


@RestController
public class HomeController {
	
	
	
private final ServiceLayer serviceLayer;
	
	@Autowired
	public HomeController(ServiceLayer serviceLayer ) {
		
		this.serviceLayer= serviceLayer;
		
	}
	
	@GetMapping("/{movieId}")
	public String  getMovieInfo(@PathVariable ("movieId") String movieId) {
		
		return serviceLayer.consumeApi(movieId);
		
	}

}
