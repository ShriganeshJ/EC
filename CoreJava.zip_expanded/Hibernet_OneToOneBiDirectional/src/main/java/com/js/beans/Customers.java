package com.js.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Customers {

	@Id
	private int panNumber;
	private String name;
	private String address;
	@OneToOne(targetEntity = PanCard.class, cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name ="panNumber",referencedColumnName = "panNumber")
	PanCard panc;

	public int getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(int panNumber) {
		this.panNumber = panNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public PanCard getPanc() {
		return panc;
	}

	public void setPanc(PanCard panc) {
		this.panc = panc;
	}

}
