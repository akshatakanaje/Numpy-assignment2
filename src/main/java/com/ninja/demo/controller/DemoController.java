package com.ninja.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ninja.demo.entity.DemoEntity;
import com.ninja.demo.jpa.DemoRepository;

@RestController
@RequestMapping("/customers")
public class DemoController {
	
	@Autowired
	DemoRepository demoRepository;
	
	//Get all customer
	@GetMapping
	List<DemoEntity> getAllCustomer(){
		return demoRepository.findAll();
	}
	
	 // Get Single Customer
	@GetMapping("/{id}")
	Optional<DemoEntity> findOneCustomer(@PathVariable Long id){
		return demoRepository.findById(id);
	}

	 // Create New Customer
	@PostMapping
	DemoEntity createCustomer(@RequestBody DemoEntity newCustomer) {
		return demoRepository.save(newCustomer);
	}
	
	// update customer information
	@PutMapping("/{customerId}")
	DemoEntity updateCustomer(@RequestBody DemoEntity updatedCustomer, @PathVariable Long customerId) {
		return demoRepository.save(updatedCustomer);
	}
	
	 // Delete Single Customer
	@DeleteMapping("/{id}")
	void deleteCustomer(@PathVariable Long id) {
		demoRepository.deleteById(id);
	}
	
}
