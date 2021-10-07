package com.syn.functional;

import java.util.function.Function;

public class FunctionChaining {

	// and then and compose
	public static void main(String[] args) {

		Function<String, String> f1 = i -> i.toUpperCase();
		Function<String, String> f2 = i -> i.substring(0, 6);

		System.out.println(f1.andThen(f2).apply("ganeshjadhav"));

		System.out.println(f1.compose(f2).apply("ganeshjadhav"));

		// Example 2

		Function<Integer, Integer> fu1 = i -> i + i;
		Function<Integer, Integer> fu2 = i -> i * i * i;

		System.out.println(fu1.andThen(fu2).apply(2));
		System.out.println(fu1.compose(fu2).apply(2));

	}

}
