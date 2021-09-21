package com.js.java;

public class SingleT {
	
	private SingleT() {
		// TODO Auto-generated constructor stub
	}
	
	
	static SingleT obj = new SingleT();
	
	
	
	public SingleT getInstance()
	{
	
		return obj;
	}
	
	
	
	

}
