package com.js.constructorInject;

public class IdfcBank {

	public IdfcBank(RBI rbi) {
		
		System.out.println("Consturcto value Injected");
		System.out.println(rbi);
	}
	
}
