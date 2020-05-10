package com.example.catalog.entity;

import java.util.List;

public class userRating {

	private String userId;
	private List<Rating> userRating;

	public userRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public userRating(String userId, List<Rating> userRating) {
		super();
		this.userId = userId;
		this.userRating = userRating;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}

	@Override
	public String toString() {
		return "userRating [userId=" + userId + ", userRating=" + userRating + "]";
	}

}
