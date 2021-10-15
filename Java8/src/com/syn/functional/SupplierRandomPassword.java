package com.syn.functional;

import java.util.function.Supplier;

public class SupplierRandomPassword {
	
	public static void main(String[] args) {
		Supplier<String> s =()->{
			Supplier<Integer> digit=()->(int)(Math.random()*10);
			String symbol ="ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
			Supplier<Character> c =()->symbol.charAt((int)Math.random()*29);
			String password="";
			
			//length 8
			//even place digit
			//odd place symobols
			for(int i=0;i<8;i++)
			{
				
				if(i%2==0)
				{ 
					password=password+digit.get();
				}
				else
				{
					password=password+c.get();
				}
				
			}
			
			return password;
		};
		
		
		
		
		System.out.println("Password is ::"+s.get());
		System.out.println("Password is ::"+s.get());
		System.out.println("Password is ::"+s.get());
		System.out.println("Password is ::"+s.get());
		System.out.println("Password is ::"+s.get());
	}

}
