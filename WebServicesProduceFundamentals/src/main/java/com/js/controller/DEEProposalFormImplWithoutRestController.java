package com.js.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.js.beans.ProposalBO;

@Controller
@ResponseBody
public class DEEProposalFormImplWithoutRestController {

	@RequestMapping(value = { "/index01", "/login01",
			"/home01" }, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	

	public String getMessage() {
		return "Welcome TP";
	}
	
	
	

	

}
