package com.lakshmi.covid.tracker.controller;

import org.springframework.web.bind.annotation.RestController;

import com.lakshmi.covid.tracker.model.Admin;

@RestController
public class AdminController {

	public Admin registerAdmin(Admin admin) {
		return admin;
		
	}
	
	
	public  void updateCovidResult() {

	}
}


