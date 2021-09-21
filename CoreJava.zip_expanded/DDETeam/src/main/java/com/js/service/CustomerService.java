package com.js.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.beans.CustomerDetails;
import com.js.dao.CustomerRepositryImpl;

@Service
public class CustomerService {
	
	
	
	@Autowired
	CustomerRepositryImpl repositry;
	
	public List<CustomerDetails> getDetails()
	{
		
	return (List<CustomerDetails>) repositry.findAll();
		
		
	}
	

}
