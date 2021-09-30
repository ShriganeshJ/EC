package com.js.java;

import java.util.Arrays;
import java.util.List;

public class DuplicateValues {
	
	
	
	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(10,20,30,40,60,10,20);
	
	
	for(int i=0;i<list.size();i++)
	{
		
		for(int j=i+1;j<list.size();j++)
		{
			
			if(list.get(i)==list.get(j))
			{
				
				System.out.println(list.get(i));
				
			}
			
			
		}
		
		
	}
	
	
	}

}
