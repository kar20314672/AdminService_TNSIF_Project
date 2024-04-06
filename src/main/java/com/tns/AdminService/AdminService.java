package com.tns.customerservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminService 
{
	@Autowired
	private AdminRepository repo;
	//Inserting the records to the table in database
	public void insertRecord(Admin_service cust)
	{
		repo.save(cust);
	}
	
	//Show all the records from the table in database
	public List<Admin_service> getAllRecords()
	{
		return repo.findAll();
	}
	
	//Show specific record from the table in database
	public Admin_service getCustomerById(Integer id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//Deleting the specific record from the table in database
	public void deleteCustomer(Integer id)
	{
		repo.deleteById(id);
	}
	
	//updating the existing record
	public void updateCustomer(Integer id,Admin_service updateCustomer)
	{
		Admin_service existingCustomer=repo.findById(id).orElse(null);
		if(existingCustomer!=null)
		{
			existingCustomer.setCid(updateCustomer.getCid());
			existingCustomer.setCname(updateCustomer.getCname());
			existingCustomer.setAddress(updateCustomer.getAddress());
			repo.save(existingCustomer);
		}
	}
	
	
	
	
	
	
	
	
}
