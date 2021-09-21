package com.js.beans;





import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ForeignKey;

@Entity
public class ClientProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int inc;
	private String policyNumber;
	private Date cancellationDate;
	private double cancellationAmount;
	
	private String endormsentNumber;
	private String receiptNumber;
	public int getInc() {
		return inc;
	}
	public void setInc(int inc) {
		this.inc = inc;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	
	public double getCancellationAmount() {
		return cancellationAmount;
	}
	public void setCancellationAmount(double cancellationAmount) {
		this.cancellationAmount = cancellationAmount;
	}

	public String getEndormsentNumber() {
		return endormsentNumber;
	}
	public void setEndormsentNumber(String endormsentNumber) {
		this.endormsentNumber = endormsentNumber;
	}
	public String getReceiptNumber() {
		return receiptNumber;
	}
	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}
	public Date getCancellationDate() {
		return cancellationDate;
	}
	public void setCancellationDate(Date cancellationDate) {
		this.cancellationDate = cancellationDate;
	}
	@Override
	public String toString() {
		return "ClientProfile [inc=" + inc + ", policyNumber=" + policyNumber + ", cancellationDate=" + cancellationDate
				+ ", cancellationAmount=" + cancellationAmount + ", endormsentNumber=" + endormsentNumber
				+ ", receiptNumber=" + receiptNumber + "]";
	}

}
