package com.lakshmi.covid.tracker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lakshmi.covid.tracker.model.Assessment;
import com.lakshmi.covid.tracker.model.CovidRisk;
import com.lakshmi.covid.tracker.model.User;
import com.lakshmi.covid.tracker.service.SelfAssessmentService;
import com.lakshmi.covid.tracker.service.UserService;

@RestController
public class UserController {
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@Autowired 
	SelfAssessmentService selfAssessmentService;

	@PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
	public User registerUser(@RequestBody User user) {
		return userService.registerUser(user);
	}

	@PostMapping(value = "/assess", consumes = MediaType.APPLICATION_JSON_VALUE)
	public CovidRisk selfAssess(@RequestBody Assessment assessment) {
		return selfAssessmentService.selfAssess(assessment);
	}
	
}
