package com.js.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;
	private long policyNumber;
	private String ensured1;

	@ManyToOne(targetEntity = Policy.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "policyNumber",referencedColumnName = "policyNumber",insertable=false, updatable=false)
	private Policy policy;
	
	
	
	public long getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getEnsured1() {
		return ensured1;
	}
	public void setEnsured1(String ensured1) {
		this.ensured1 = ensured1;
	}
	
	
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	
	
}
