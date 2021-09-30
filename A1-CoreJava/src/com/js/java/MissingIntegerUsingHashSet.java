package com.js.java;

import java.util.HashSet;

public class MissingIntegerUsingHashSet {
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(solution(new int [] {1,2,3,4,5,6,7,9,10}));
		
	}
	
	
	
	public static int solution(int arr[]) 
	{
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=1;i<arr.length+1;i++)
		{
			System.out.print("Set"+i);
			set.add(i);
			System.out.println();
		}
		
		
		for(int a: arr)
		{
			System.out.print("A  "+a);
			set.remove(new Integer(a));
			System.out.println();
		}
		
		
		return set.iterator().next();	
	}
	
	

}
