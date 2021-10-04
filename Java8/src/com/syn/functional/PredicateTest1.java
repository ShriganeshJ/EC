package com.syn.functional;

import java.util.List;
import java.util.function.Predicate;

public class PredicateTest1 {

	public static void main(String[] args) {
		
		
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(100));
		System.out.println(p.test(2));

		
		
		Predicate<String> p2 = i -> i.equals("Durga");
		System.out.println(p2.test("Durga"));
		System.out.println(p2.test("durga44"));
		
		
		
		Predicate<String> p3 = i -> i.length()>5;
		System.out.println(p3.test("gane"));
		System.out.println(p3.test("ganeshjk"));
		
		
		
		

	}

}
