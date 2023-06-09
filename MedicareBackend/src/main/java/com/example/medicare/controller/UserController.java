package com.example.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicare.entities.User;
import com.example.medicare.services.UserService;
import com.example.medicare.userAuthentication.UserAuthentication;

@RestController
@CrossOrigin
@RequestMapping("api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	// API to authenticate the user at the time of login
	@PostMapping("/checkUser")
	public User AuthenticateUser(@RequestBody UserAuthentication user) {
		System.out.println("API hitting");
		System.out.println(user);

		System.out.println("Authenticate user API calling");

		User u = userService.AuthenticateUser(user);
		System.out.println(u);

		return u;
	}
	
	@GetMapping("/allUsers")
	public List<User> allUsers()
	{
		return userService.allUsers();
	}
	
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable("id")int id)
	{
		System.out.println("getUser api hitting...");
		return userService.getUser(id);
	}
	
	@PutMapping("/updateUser/{id}")
	public User updateUser(@RequestBody User user, @PathVariable("id")int id)
	{
		return userService.updateUser(user,id);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable("id")int id)
	{
		userService.deleteUser(id);
	}
}
