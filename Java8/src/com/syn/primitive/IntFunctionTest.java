package com.syn.primitive;

import java.util.function.ToIntFunction;

public class IntFunctionTest {
	
	public static void main(String[] args) {
		
		
		ToIntFunction<String>fu= s ->{
			
			int sum=0;
			
			for(int i=0;i<s.length();i++)
			{
			
				
				sum=sum+i;
				
				
			}
			
			return sum;
			
		};
		
		
		
		System.out.println(fu.applyAsInt("12345678910"));
		
	}

}
