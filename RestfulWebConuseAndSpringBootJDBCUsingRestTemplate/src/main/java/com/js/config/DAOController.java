package com.js.config;

import org.springframework.context.annotation.Configuration;

import com.js.dao.DetailsDAO;
import com.js.dao.DetailsDAOImpl;

@Configuration
public class DAOController {

	public DetailsDAO getDao() {

		return new DetailsDAOImpl();
	}

}
