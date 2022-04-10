package com.exmple.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmple.demo.repository.UserRepository;
import com.exmple.demo.user.User;

@Service
public class UserService {
	
	@Autowired
	private  UserRepository userRepo; 
	
	public String saveUser(User user) {
		  User save=userRepo.save(user);
		  Integer userId=save.getUserId();
		  if(userId>0) {
			  return "user saved";
			  
		  }else {
			  return "failed to save user";
		  }
		
	}
	
	
	

}
