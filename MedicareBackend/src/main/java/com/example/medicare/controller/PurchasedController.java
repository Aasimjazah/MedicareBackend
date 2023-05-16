package com.example.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicare.entities.Medicine;
import com.example.medicare.entities.Purchased;
import com.example.medicare.services.PurchasedService;


@RestController
@CrossOrigin
@RequestMapping("/api/purchased")
public class PurchasedController {

	@Autowired
	private PurchasedService purchasedService;
	
	
	@PostMapping("/addPurchased")
	public Purchased addPurchased(@RequestBody Purchased purchased) throws InterruptedException 
	{
		Thread.sleep(2000);
		return purchasedService.addPurchased(purchased);
	}
	@GetMapping("/getAllPurchased")
	public List<Purchased> getAllPurchased()
	{
		return purchasedService.getAllPurchasedService();
	}
	
	@GetMapping("/myOrder/{email}")
	public List<Medicine> getAllPurchased(@PathVariable String email)
	{
		System.out.println(email);
		return purchasedService.getPurchasedByUserEmailService(email);
	}
	
	
}
