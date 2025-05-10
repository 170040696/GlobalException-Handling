package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Tourist;

@Repository
public interface iTouristRepo extends JpaRepository<Tourist,Integer>{

	
	
}
