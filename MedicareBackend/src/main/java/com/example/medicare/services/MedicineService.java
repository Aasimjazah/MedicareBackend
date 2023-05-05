package com.example.medicare.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicare.entities.Medicine;
import com.example.medicare.repo.MedicineRepo;

@Service
public class MedicineService {

	@Autowired
	private MedicineRepo medicineRepo;
	
	public Medicine addMedicine(Medicine medicine)
	{
		return medicineRepo.save(medicine);
	}

	public List<Medicine> allMedicine() {
		
		return (List<Medicine>) medicineRepo.findAll();
	}
}
