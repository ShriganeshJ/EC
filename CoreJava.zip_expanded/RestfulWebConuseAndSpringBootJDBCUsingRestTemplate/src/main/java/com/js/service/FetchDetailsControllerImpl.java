package com.js.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PreDestroy;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.EntityResponse;

import com.js.beans.CasesBO;
import com.js.beans.CasesVO;
import com.js.beans.VOListClass;
import com.js.dao.DetailsDAO;

@Controller("fetch")
public class FetchDetailsControllerImpl {

	@Autowired
	RestTemplate restTemplate;
	@Autowired
	List<CasesBO> boList;
	@Autowired
	DetailsDAO dao;
	ArrayList<CasesVO> vo;
	
	

	String url = "https://jsonplaceholder.typicode.com/todos";

	public FetchDetailsControllerImpl() {

		System.out.println("FetachDetails Controller ");
	}

	public void getDetails() {

		CasesVO[] vo = restTemplate.getForObject(url, CasesVO[].class);

		List<CasesVO> list = Arrays.asList(vo);

		for (int i = 0; i < list.size(); i++) {
			CasesBO bo = new CasesBO();
			bo.setCompleted(Boolean.valueOf(list.get(i).getCompleted()));
			bo.setId(Integer.valueOf(list.get(i).getId()));
			bo.setTitle(list.get(i).getTitle());
			bo.setUserId(Integer.parseInt(list.get(i).getUserId()));

			boList.add(bo);
		}
		
		
		dao.getDetails(boList);

	}

}
