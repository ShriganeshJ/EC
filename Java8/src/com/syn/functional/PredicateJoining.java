package com.syn.functional;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		int[] x = { 1, 2, 5, 6, 9, 10, 21, 45, 32, 14, 52, 44, 55, 71, 72, 45, 65, 22, 1, 4, 7, 8, 32, 8 };

		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println("check given number is grater than 10 :");
		m1(p1, x);
		System.out.println("Even numbers are:");
		m1(p2, x);
		System.out.println("Number not grater than 10 and even: ");
		m1(p1.negate().and(p2), x);
		System.out.println("Number grater than 10 or even");
		m1(p1.or(p2), x);

	}

	public static void m1(Predicate<Integer> p, int x[]) {

		for (int i = 0; i < x.length; i++) {
			if (p.test(x[i])) {
				System.out.println(x[i]);

			}
		}

	}
}