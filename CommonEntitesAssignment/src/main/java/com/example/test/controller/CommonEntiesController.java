package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.exception.RecordNotFoundException;
import com.example.test.model.UomConversionDated;
import com.example.test.service.CommonEntiesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/common")
public class CommonEntiesController {

	@Autowired
	CommonEntiesService service;

	// adding all the recods with child records
	@PostMapping("/addAllRecord")
	public String addAllRecords(@RequestBody UomConversionDated dated) {
		 service.addAllRecords(dated);
		 return " user Successfully inserted";
		
	}

	// get all records with child
	@GetMapping("/getAll")
	public List<UomConversionDated> findAllRecords() {
		return service.findAllRecords();
	}

	// fetch records of child and parent with parent id
	@GetMapping("/getRecords/{id}")
	public UomConversionDated getById(@RequestBody @PathVariable int id) throws RecordNotFoundException {
		return service.fetchById(id);
	}

	// delete records of child and parent with parent id
	@DeleteMapping("/deleteby/{id}")
	public String deleteById(@RequestBody @PathVariable int id) throws RecordNotFoundException {
		return service.deleteId(id);
	}

	// update record of child and parent with parent id
	@PutMapping("/update/{id}")
	public UomConversionDated updateById(@PathVariable int id, @RequestBody UomConversionDated updateDetails) throws RecordNotFoundException {

		return service.updateId(id, updateDetails);
	}

}
