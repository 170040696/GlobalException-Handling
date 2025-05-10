package com.example.service;

import java.util.List;

import com.example.exception.TouristNotFoundException;
import com.example.model.Tourist;


public interface iTouristService {
	
	String registerTourist(Tourist tourist);
	Tourist FetchTouristById(Integer id) throws TouristNotFoundException; 
	List<Tourist> fetchAlltheTourists();
    String UpdatetheTourist(Tourist tourist) throws TouristNotFoundException;
    String updatetheTouristBudget(Integer id, double budget) throws TouristNotFoundException;
    String DeleteTouristById(Integer id) throws TouristNotFoundException ;
}
