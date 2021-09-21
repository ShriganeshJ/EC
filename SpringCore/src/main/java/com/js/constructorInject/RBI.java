package com.js.constructorInject;

public class RBI {

	
	String loan;
	
	String repo;
	public RBI(String loan,String repo) {
		this.loan=loan;
		this.repo=repo;
	}
	@Override
	public String toString() {
		return "RBI [loan=" + loan + ", repo=" + repo + "]";
	}
	
	
	
	
}
