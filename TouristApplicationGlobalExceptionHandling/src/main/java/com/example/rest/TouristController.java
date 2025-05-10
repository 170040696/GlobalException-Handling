package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.TouristNotFoundException;
import com.example.model.Tourist;
import com.example.service.TouristService;
import com.example.service.iTouristService;

@RestController
@RequestMapping("Tourist_api")
public class TouristController {
	
	@Autowired
	private iTouristService service;
	
	@GetMapping("/Getalltouristes")
	public ResponseEntity<?> GetallTouriets(){
				List<Tourist>t=service.fetchAlltheTourists();
		return new ResponseEntity<List>(t,HttpStatus.OK);
		
	}
	
	@PostMapping("/registerTourists")
	public ResponseEntity<String> SaveTouristes(@RequestBody Tourist tourist) {
		
		return new ResponseEntity<String>(service.registerTourist(tourist),HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/deleteTourists/{id}")
	public ResponseEntity<String> DeleteTourists(@PathVariable("id")Integer id) {
		
		return new ResponseEntity<String>(service.DeleteTouristById(id),HttpStatus.OK);
		
	}
	
	@GetMapping("/GetTouristById/{id}")
	public ResponseEntity<?> GetTouristById(@PathVariable("id") Integer id) {
		
			 return new ResponseEntity<Tourist>(service.FetchTouristById(id),HttpStatus.OK);
		
	}

	@PutMapping("/UpdateTourist")
	public ResponseEntity<String> UpdateTourist(@RequestBody Tourist tourist)
	{
		
			return new ResponseEntity<String>(service.UpdatetheTourist(tourist),HttpStatus.OK);
		
	}
	
	@PatchMapping("/UpdateTouristBudget/{id}/{budget}")
	public ResponseEntity<String> UpdateTouristBudget(@PathVariable("id")Integer id,@PathVariable("budget") double budget) {
		
			return new ResponseEntity<String>(service.updatetheTouristBudget(id, budget),HttpStatus.OK);
		
	}
}
