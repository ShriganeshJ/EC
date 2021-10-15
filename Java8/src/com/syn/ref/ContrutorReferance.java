package com.syn.ref;

public class ContrutorReferance {
	
	
	interface Interfe
	{
		public ContrutorReferance get();
	}
	
	
	
	public ContrutorReferance() {
		// TODO Auto-generated constructor stub
		
		System.out.println("NO arg Sample Consturctor");
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		Interfe inf  = ContrutorReferance::new;
		
		System.out.println(inf.get());
	}
	
}
