  package com.js.java;

public class PrimeNumbers {
	
	
	public static void main(String[] args) {
		
		
		
		
		int number=8;
		boolean flag=false;
		
		
		for(int i=2;i<number-1;i++)
		{
			
			
			if(number%i==0)
			{
				
				System.out.println(number%i);
				flag=true;
			}
			
			
		}
		
		
		if(flag==true)
		{
			System.out.println("Not a  prime");
		}
		else
		{
			System.out.println("Number is prime");
		}
		
		
		
		
	}
	

}




