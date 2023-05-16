package com.example.medicare.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicare.entities.Medicine;
import com.example.medicare.entities.Purchased;
import com.example.medicare.repo.MedicineRepo;
import com.example.medicare.repo.PurchasedRepo;


@Service
public class PurchasedService {
	
	@Autowired
	private PurchasedRepo purchasedRepo;
	
	@Autowired
	private MedicineRepo medicineRepo;
	
	public Purchased addPurchased(Purchased purchased)
	{
		purchased.setStatus("Pending");
		return purchasedRepo.save(purchased);
	}
	
	public List<Purchased> getAllPurchasedService()
	{
		List<Purchased> pur= (List<Purchased>) purchasedRepo.findAll();
		return pur;
	}
	
	public List<Medicine> getPurchasedByUserEmailService(String email)
	{
		List<Purchased> purchased = (List<Purchased>) purchasedRepo.findByUserEmail(email);
		List<Medicine> medicines=purchased.stream().map(e->medicineRepo.findById(e.getProductId())).toList();
		
		return medicines;
	}
	
}
