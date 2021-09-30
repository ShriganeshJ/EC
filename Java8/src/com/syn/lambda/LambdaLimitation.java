package com.syn.lambda;


import java.util.Arrays;
import java.util.List;

public class LambdaLimitation {
	
	
	public static void main(String[] args) {
		
	List<Integer> list = Arrays.asList(10,20,30,40,50);
	
	
	
	list.forEach(i->{
		int a;
		
		
		if(i>30)
		{
			a=a+i;
		}
		
	});
		

		
	}

}
