package com.example.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicare.entities.Medicine;
import com.example.medicare.repo.MedicineRepo;
import com.example.medicare.services.MedicineService;

@RestController
@CrossOrigin
@RequestMapping("/api/medicine")
public class MedicineController {

	@Autowired
	private MedicineService medicineService;
	
	@Autowired
	private MedicineRepo medicineRepo;
	
	@PostMapping("/addMedicine")
	public Medicine addMedicine(@RequestBody Medicine medicine)
	{
		return medicineService.addMedicine(medicine);
	}
	
	@PutMapping("/uploadImage/{id}")
	public void uploadImage(@PathVariable("id") int id,@RequestBody String url)
	{
		System.out.println("calling uplaodImage api.....");
		System.out.println(id);
		System.out.println(url);
		
		Medicine medicine=medicineRepo.findById(id);
		medicine.setImageURL(url);
		medicineRepo.save(medicine);
	}
	
	@GetMapping("/allMedicines")
	public List<Medicine> allMedicine()
	{
		return medicineService.allMedicine();
	}
}
