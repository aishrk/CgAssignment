package com.example.catalog.hystrix;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.catalog.entity.Rating;
import com.example.catalog.entity.userRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserRatingHystrix {


	@Autowired
	private RestTemplate restTemplate; 
	
	@HystrixCommand(fallbackMethod = "getFallbackUserRating")
	public userRating getUserRating(String userId) {
		return restTemplate.getForObject("http://rating-data-service/ratingdata/user/" + userId, userRating.class);
	}

	// fallback method for getUserRating
	public userRating getFallbackUserRating(String userId) {
		userRating rating = new userRating();
		rating.setUserId(userId);
		rating.setUserRating(Arrays.asList(new Rating("no movieid Present ", 0)));
		return rating;

	}
	
}