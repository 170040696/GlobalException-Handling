package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.iTouristRepo;
import com.example.exception.TouristNotFoundException;
import com.example.model.Tourist;

@Service
public class TouristService implements iTouristService {

	@Autowired
	private iTouristRepo repo;
	
	@Override
	public String registerTourist(Tourist tourist) {
		Tourist t=repo.save(tourist);
		return "Tourist info saved with id: "+t.getId();
	}

	@Override
	public Tourist FetchTouristById(Integer id) throws TouristNotFoundException {
		//repo.getReferenceById(id);
//		Optional<Tourist>opt= repo.findById(id);
//		if(opt.isPresent())
//		{return opt.get();}
//		else {
//		throw new TouristNotFoundException("Tourist not found with given id");	
//		}
		return repo.findById(id).orElseThrow(()->new TouristNotFoundException("Tourist is not found with given id"));
	}

	@Override
	public List<Tourist> fetchAlltheTourists() {
		
		return repo.findAll();
	}

	@Override
	public String UpdatetheTourist(Tourist tourist) throws TouristNotFoundException{
		Optional<Tourist>opt= repo.findById(tourist.getId());
		if(opt.isPresent()) {
			
         repo.save(tourist);
         return "data updated with given info";
		}
		else {
			throw new TouristNotFoundException("Tourist not found  to update");	
		}
		
	}

	@Override
	public String updatetheTouristBudget(Integer id, double budget) throws TouristNotFoundException {
		Optional<Tourist>opt= repo.findById(id);
		if(opt.isPresent()) {
			
	         Tourist t=opt.get();
	         t.setBudget(budget);
	         repo.save(t);
	         return "budget updated with given info successfully";
			}
			else {
				throw new TouristNotFoundException("Tourist not found with given id to update");	
			}
	}

	@Override
	public String DeleteTouristById(Integer id)  throws TouristNotFoundException{
		Optional<Tourist>opt= repo.findById(id);
		if(opt.isPresent()) {
			
	        repo.deleteById(id);
	         return "delete tourist successfully";
			}
			else {
				throw new TouristNotFoundException("Tourist not found with given id to delete");	
			}
		
	}

}
