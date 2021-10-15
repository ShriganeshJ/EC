package com.syn.functional;

import java.util.function.BiPredicate;

public class BiPredicateTest {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> pb = (a,b)-> (a+b)%2==0;
		
		System.out.println(pb.test(10,2));
		
		System.out.println(pb.test(10,5));
		
		
	}

}
