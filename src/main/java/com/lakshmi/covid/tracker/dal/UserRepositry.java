package com.lakshmi.covid.tracker.dal;

import org.springframework.data.repository.CrudRepository;

import com.lakshmi.covid.tracker.model.User;

@Repositry
public class UserRepositry implements CrudRepository<User, Integer>{

}
