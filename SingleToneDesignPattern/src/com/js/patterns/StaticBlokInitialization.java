package com.js.patterns;

public class StaticBlokInitialization {

	// Smiler to eagerInitialization
	// here we can handle exception
	//eager initialization is not good pratic 

	private static StaticBlokInitialization blokInitialization;

	static {
		try {
			blokInitialization = new StaticBlokInitialization();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private StaticBlokInitialization() {
		// TODO Auto-generated constructor stub
	}

	public static StaticBlokInitialization getInstace() {

		return blokInitialization;
	}

	private static void getInstace2() {

		System.out.println(StaticBlokInitialization.getInstace().hashCode());
		// TODO Auto-generated method stub

	}

	private static void getInstace1() {
		System.out.println(StaticBlokInitialization.getInstace().hashCode());
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		getInstace1();
		getInstace2();
	}

}
