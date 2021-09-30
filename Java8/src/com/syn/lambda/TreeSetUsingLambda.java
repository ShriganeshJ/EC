package com.syn.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetUsingLambda {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<>();
		List<Integer> list = Arrays.asList(10, 20, 60, 32, 54, 5, 10, 21, 4, 85, 6, 9, 21, 4, 78, 96, 5, 21);
		set.addAll(list);
		
		System.out.println("TreeSet::"+set);
		//using lambda
		TreeSet<Integer> set2 = new TreeSet<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		set2.addAll(list);
		System.out.println("TreeSet2::"+set2);

	}

}
