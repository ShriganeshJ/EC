package com.syn.lambda;

public class LambdaExpressionSum {
	
	@FunctionalInterface
	public interface Inf
	{
		public int add(int a,int b);
	}
	

	
	public static void main(String[] args) {
		
		
		Inf i = (int a, int b)-> {
			return a+b;
		};
		
		
		//call expression 
		
		System.out.println("Addition is::"+i.add(10, 20));
		
		
	}
	
	
	
}
