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

@Controller("fileupload")
public class UploadFileController {

	@Autowired
	RestTemplate restTemplate;
	@Autowired
	List<CasesBO> boList;
	@Autowired
	DetailsDAO dao;
	List<CasesVO> vo;

	public UploadFileController() {

		System.out.println("FetachDetails Controller ");
	}

	public void uploadFiles() {

		HttpHeaders headers = new HttpHeaders();

		headers.setContentType(MediaType.MULTIPART_FORM_DATA);

		MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
		body.add("files", "\"C:\\Users\\HP\\Downloads\\rakul-preet-singh_4 (1).jpg\"");
		//body.add("files", "\"C:\\Users\\HP\\Downloads\\rakul-preet-singh_4 (1).jpg\"");
	//	body.add("files", "\"C:\\Users\\HP\\Downloads\\rakul-preet-singh_4 (1).jpg\"");

		HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);

		String serverUrl = "http://localhost:8080/";

		ResponseEntity<String> response = restTemplate.postForEntity(serverUrl, requestEntity,String.class);
		
		
		System.out.println("response is "+response);

		//

	}

}
