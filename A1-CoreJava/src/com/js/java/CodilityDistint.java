package com.js.java;

import java.util.HashSet;

public class CodilityDistint {

	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("size is :: "+solution(new int [] {2,1,1,2,3,1}));
		
	}
	
	
	
	
	public static int solution(int arr[])
	{
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
			
		}
		
		
		return set.size();
		
	}
}
