package com.example.medicare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicare.entities.Admin;
import com.example.medicare.repo.AdminRepo;



@Service
public class AdminService {

	@Autowired
	private AdminRepo adminRepo;
	
	public Admin addAdmin(Admin admin) 
	{
		Admin addAdmin= adminRepo.save(admin);
		
		 return addAdmin;
		
	}
	
	public Admin getAdmin(Admin admin) 
	{
		Admin adminCred= adminRepo.findByEmailAndPassword(admin.getEmail(), admin.getPassword());
			return adminCred;

	}

}
