package com.syn.ref;

public class MethodReferanceTest {
	
	
	
	//rule :: method argument should be same
	//syntax static :: ClassName::method name
	//non static :: SomeObjectReferance::method name
	//Test t = new Test()
	//t::m2;

	interface interf {
		public String m1();
	}

	public static String m2() {
		return "someLogic";
	}

	public static void main(String[] args) {

		interf itf = MethodReferanceTest::m2;

		System.out.println(itf.m1());

    	}

}
