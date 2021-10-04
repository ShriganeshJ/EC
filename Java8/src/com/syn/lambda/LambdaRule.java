package com.syn.lambda;

public class LambdaRule {
	// global variable
	int y = 20;

	public void m2() {

		// local variable refereed from lambda expression must be final

		// local variable
		int x = 10;

		interf i = () -> {

			int y = 40;
			int x = 54;

			System.out.println("int x  " + x);
			System.out.println("int y " + y);

		};

		i.m1();

	}

	interface interf {
		public void m1();
	}

	public static void main(String[] args) {

		LambdaRule lr = new LambdaRule();
		lr.m2();

	}

}
