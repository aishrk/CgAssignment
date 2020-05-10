package com.example.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.info.entity.MovieSummary;
import com.example.info.entity.Movies;


@RestController
@RequestMapping("/movies")
public class MovieInfoController {
	   @Value("${api.key}")
	    private String apiKey;
	   @Autowired
	    private RestTemplate restTemplate;
	   
	@RequestMapping("/{movieId}")
	public Movies getmovie(@PathVariable("movieId") String movieId) {
		//https://www.themoviedb.org/settings/api
		MovieSummary movieSummary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" +  apiKey, MovieSummary.class);
        return new Movies(movieId, movieSummary.getTitle(), movieSummary.getOverview());

		
	}

}