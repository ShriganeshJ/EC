package com.js.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.js.beans.ProposalBO;

@RestController
public class DEEProposalFormImplWithRestController {

	@RequestMapping(value = { "/", "/index", "/login",
			"/home" }, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getMessage() {
		return "Welcome";
	}

	@RequestMapping(value = { "details" }, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)

	public List<ProposalBO> getList() {

		List<ProposalBO> list = Arrays.asList(new ProposalBO("raja", LocalDate.now(), 452.32, "P-4852", "A45214"),
				new ProposalBO("raja", LocalDate.now(), 452.32, "P-4852", "A45214"),
				new ProposalBO("raja", LocalDate.now(), 452.32, "P-4852", "A45214"),
				new ProposalBO("raja", LocalDate.now(), 452.32, "P-4852", "A45214"),
				new ProposalBO("raja", LocalDate.now(), 452.32, "P-4852", "A45214"));

		return list;
	}

}
