package com.js.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmailBodyData {
	
	@Id
	private String aggId;
	private String rcNumber;
	private String engNumber;
	private String chassiesNumber;
	private String sender;
	private String subject;
	private String reqId;
	
	
	public String getAggId() {
		return aggId;
	}
	public void setAggId(String aggId) {
		this.aggId = aggId;
	}
	public String getRcNumber() {
		return rcNumber;
	}
	public void setRcNumber(String rcNumber) {
		this.rcNumber = rcNumber;
	}
	public String getEngNumber() {
		return engNumber;
	}
	public void setEngNumber(String engNumber) {
		this.engNumber = engNumber;
	}
	public String getChassiesNumber() {
		return chassiesNumber;
	}
	public void setChassiesNumber(String chassiesNumber) {
		this.chassiesNumber = chassiesNumber;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getReqId() {
		return reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	@Override
	public String toString() {
		return "EmailBodyData [aggId=" + aggId + ", rcNumber=" + rcNumber + ", engNumber=" + engNumber
				+ ", chassiesNumber=" + chassiesNumber + ", sender=" + sender + ", subject=" + subject + ", reqId="
				+ reqId + "]";
	}

}
