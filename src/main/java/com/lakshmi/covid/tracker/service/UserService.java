package com.lakshmi.covid.tracker.service;

import com.lakshmi.covid.tracker.model.User;

public interface UserService {

	public User registerUser(User user);
	
	public User getUserById(int id);
		
}
