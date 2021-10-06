package com.syn.functional;

import java.util.List;
import java.util.function.Function;

public class FunctionInterface {
	
	
	//accept any 

	public static void main(String[] args) {

		Function<String, Integer> f = i -> i.length();

		// call function
		System.out.println(f.apply("Durga"));

		// square of number

		Function<Integer, Integer> sqr = i -> i * i;

		System.out.println(sqr.apply(10));

		// replace

		Function<String, String> fun = s1 -> s1.replaceAll(" ", "");

		System.out.println(fun.apply("My Name Is Ganesh"));

		// cal number of spaces in string

		Function<String, Integer> fun02 = s1 -> s1.length() - s1.replaceAll(" ", "").length();

		System.out.println(fun02.apply("T oday is Sun day fun d ay"));
		
		
		
		
		
		

	}

}
