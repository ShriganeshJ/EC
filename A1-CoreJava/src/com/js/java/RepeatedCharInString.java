package com.js.java;

public class RepeatedCharInString {
	
	
	public static void main(String[] args) {
		String str = "bdabcdecavc";
		
		
		
		for(int i=0;i<str.length();i++)
		{
			int flag=0;
			for(int j=i+1;j<str.length()-1;j++)
			{
			if(str.charAt(i)==str.charAt(j))
			{
				System.out.println("Duplicate "+str.charAt(i));
				
			}
			
			}
			
			
			
			
		}
		
		
		
	}

}
