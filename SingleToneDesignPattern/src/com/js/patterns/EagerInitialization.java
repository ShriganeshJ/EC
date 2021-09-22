package com.js.patterns;

public class EagerInitialization {

	// create instance before calling getInstace()
	// we can't handle exception in eagerInitalization
	// eager initialization is not good pratic

	private static EagerInitialization eagerInitialization = new EagerInitialization();

	private EagerInitialization() {

	}

	public static EagerInitialization getInstatice() {
		return eagerInitialization;
	}

	public static void main(String[] args) {
		getInstace1();
		getInstace2();
	}

	private static void getInstace2() {

		System.out.println(EagerInitialization.getInstatice().hashCode());
		// TODO Auto-generated method stub

	}

	private static void getInstace1() {
		System.out.println(EagerInitialization.getInstatice().hashCode());
		// TODO Auto-generated method stub

	}

}
