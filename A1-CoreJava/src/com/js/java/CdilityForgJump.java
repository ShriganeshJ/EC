package com.js.java;

public class CdilityForgJump {
	
	
	public static void main(String[] args) {
		
		System.out.println("forgJump::"+solution(10,85,30));
		
	}
	
	
	
	
	public static int solution(int x, int y , int d) 
	{
		
		int distance = y-x;
		int jump = (int) Math.ceil(distance/d);
		
		return jump;
		
		
	}

}
