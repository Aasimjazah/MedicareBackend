package com.example.medicare.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.medicare.entities.Medicine;

@Repository
public interface MedicineRepo extends CrudRepository<Medicine, Integer>{
	
	Medicine findById(int name);

}
