package com.js.beans;

import java.time.LocalDate;
import java.util.Date;

public class ProposalBO {
	
	
	private String customerName;
	private LocalDate customerDate;
	private Double premiumAmount;
	private String panNumber;
	private String addharNumber;
	
	
	
	public ProposalBO(String customerName, LocalDate customerDate, Double premiumAmount, String panNumber,
			String addharNumber) {
		super();
		this.customerName = customerName;
		this.customerDate = customerDate;
		this.premiumAmount = premiumAmount;
		this.panNumber = panNumber;
		this.addharNumber = addharNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public LocalDate getCustomerDate() {
		return customerDate;
	}
	public void setCustomerDate(LocalDate customerDate) {
		this.customerDate = customerDate;
	}
	public Double getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(Double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getAddharNumber() {
		return addharNumber;
	}
	public void setAddharNumber(String addharNumber) {
		this.addharNumber = addharNumber;
	}
	
	

}
