package com.example.medicare.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.medicare.entities.User;
import com.example.medicare.repo.UserRepo;
import com.example.medicare.userAuthentication.UserAuthentication;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public User addUser(User user)
	{
		 return userRepo.save(user);
	}

	public User AuthenticateUser(UserAuthentication user)
	{
		User u = userRepo.findByEmail(user.getEmail());
		if(u!=null)
		{
	        if(u.getPassword().equals(user.getPassword()))
	        {
	        	return u;
	        }
	        else
	        {
	        	return null;
	        }
		}
		
		return null;
	}

	public List<User> allUsers() {
		
		return (List<User>) userRepo.findAll();
	}

	public User getUser(int id) {
		
		return userRepo.findById(id);
	}
}
