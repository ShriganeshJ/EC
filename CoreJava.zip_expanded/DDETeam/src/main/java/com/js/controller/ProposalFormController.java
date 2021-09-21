package com.js.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.js.beans.CustomerDetails;
import com.js.service.CustomerService;

@RestController
@RequestMapping("/proposal")
public class ProposalFormController {
	@Autowired
	CustomerService serive;
	
	
	@RequestMapping(value = "/customer", produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.GET)
	public List<CustomerDetails> CustomerDetails	()
	{
	return serive.getDetails();
		
	
	
	}
	
	
	
	

}
