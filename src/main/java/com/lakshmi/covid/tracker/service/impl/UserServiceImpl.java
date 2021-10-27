package com.lakshmi.covid.tracker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lakshmi.covid.tracker.dal.UserRepositry;
import com.lakshmi.covid.tracker.model.User;
import com.lakshmi.covid.tracker.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired 
	UserRepositry userRepositry;
	
	@Override
	public User registerUser(User user) {
		return userRepositry.save(user);
	}

	@Override
	public User getUserById(int id) {
		if(userRepositry.findById(id).isPresent()) {
			return userRepositry.findById(id).get();
		}else {
			return null;
		}
	}
}
