package com.syn.functional;

import java.util.function.BiFunction;

public class BiFunctionalTest {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> bf = (a, b) -> a * b;

		System.out.println(bf.apply(30, 10));

	}

}
