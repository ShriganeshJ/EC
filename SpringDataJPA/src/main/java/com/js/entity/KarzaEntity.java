package com.js.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "karza_data")
public class KarzaEntity {
	
	@Id
	@GeneratedValue
	private int agg_id;
	private String name;
	private String rc_number;
	private String eng_number;
	private String  chasiess_number;
	private Timestamp time;
	public int getAgg_id() {
		return agg_id;
	}
	public void setAgg_id(int agg_id) {
		this.agg_id = agg_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRc_number() {
		return rc_number;
	}
	public void setRc_number(String rc_number) {
		this.rc_number = rc_number;
	}
	public String getEng_number() {
		return eng_number;
	}
	public void setEng_number(String eng_number) {
		this.eng_number = eng_number;
	}
	public String getChasiess_number() {
		return chasiess_number;
	}
	public void setChasiess_number(String chasiess_number) {
		this.chasiess_number = chasiess_number;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}

}
