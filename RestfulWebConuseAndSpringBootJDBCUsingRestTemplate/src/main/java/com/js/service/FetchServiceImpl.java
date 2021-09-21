package com.js.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.js.beans.CasesBO;
import com.js.beans.CasesVO;
import com.js.dao.DetailsDAO;

@Controller()
public class FetchServiceImpl {

	@Autowired
	RestTemplate restTemplate;
     static String serverURL ="https://reqres.in/api/register";
     static String url ="{\r\n"
     		+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
     		+ "    \"password\": \"pistol\"\r\n"
     		+ "}";
     
     
     
	public FetchServiceImpl() {

		System.out.println("FetachDetails service");
	}

	public String uploadFiles() {

		HttpHeaders headers = new HttpHeaders();

		headers.setContentType(MediaType.APPLICATION_JSON);
     
	 
	 
	 HttpEntity<String> requestEntity = 
		      new HttpEntity<String>(url, headers);
		    
	 

		ResponseEntity<String> response = restTemplate.postForEntity(serverURL, requestEntity,String.class);
		
		
		System.out.println("response is "+response);
		
		
		return response.toString();

		//

	}

}
