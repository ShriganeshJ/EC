package com.syn.lambda;

@FunctionalInterface
interface Interf {
	public int sqr(int x);
}

public class LambdaExpressionSqr {
	public static void main(String[] args) {
		Interf inf = x -> x * x;

		// call
		System.out.println(inf.sqr(10));

	}

}
