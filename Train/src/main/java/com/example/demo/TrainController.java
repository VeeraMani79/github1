package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Repository
public class TrainController {
@Autowired

   TrainRepository trainRepo;
	
	 @GetMapping(value = "/getAll")
		public List<Train>getAll() { // get all			 
			 return trainRepo.findAll();
	 }
			@GetMapping(value="/GetId/{id}") //get  id 
				public Train getId(@PathVariable int id) {
					return trainRepo.findById(id).get();
	 }
}

