package com.js.beans;

import java.util.ArrayList;
import java.util.List;

public class VOListClass {
	
	List<CasesVO> list;
	
	
	public VOListClass() {
		list= new ArrayList<CasesVO>();
	}
	

	public List<CasesVO> getList() {
		return list;
	}

	public void setList(List<CasesVO> list) {
		this.list = list;
	}

}
