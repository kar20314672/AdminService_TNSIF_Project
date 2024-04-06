package com.tns.customerservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	@Autowired
	private AdminService service;
	
	@PostMapping("/adminservice")
	public void add(@RequestBody Admin_service cust)
	{
		service.insertRecord(cust);
	}
	
	
	@GetMapping("/adminservice")
	public List<Admin_service> ShowAll()
	{
		return service.getAllRecords();
	}

	
	@GetMapping("/adminservice/{id}")
	public Admin_service getCustomerById(@PathVariable Integer id)
	{
		return service.getCustomerById(id);
	}
	
	@DeleteMapping("/adminservice/{id}")
	public void deleteCustomer(@PathVariable Integer id)
	{
		service.deleteCustomer(id);
	}
	
	@PutMapping("/adminservice/{id}")
	public ResponseEntity<String> updateCustomer(@PathVariable Integer id,@RequestBody Admin_service updatedCustomer)
	{
		service.updateCustomer(id,updatedCustomer);
		return ResponseEntity.ok("Customer updated Successfully");
	}
		
}
