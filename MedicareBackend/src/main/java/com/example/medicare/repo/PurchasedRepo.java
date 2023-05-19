package com.example.medicare.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.medicare.entities.Purchased;


@Repository
public interface PurchasedRepo extends CrudRepository<Purchased, Integer>{

	public List<Purchased> findByUserEmail(String email);
}
