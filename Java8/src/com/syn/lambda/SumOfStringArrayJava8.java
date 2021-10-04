package com.syn.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfStringArrayJava8 {

	public static void main(String[] args) {

		String str = "10,20,11,5";

		List<Integer> list = Arrays.asList(str.split(",")).
				stream().map(s -> Integer.parseInt(s.trim()))
				.collect(Collectors.toList());

		Integer sum = list.stream().reduce(Integer::sum).get();
		System.out.println("sum::" + sum);

	}
}
