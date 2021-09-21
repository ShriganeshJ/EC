package com.js.controller;

import java.util.List;

import com.js.beans.ProposalBO;

public interface DDEProposalForm {
	
	public List<ProposalBO> getProposalDataList();
	public ProposalBO getProposalDetails(String addharNumber);
	
	

}
