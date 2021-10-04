package com.syn.defstatic;





interface right
{
	public void m1();
	
}


interface left
{
	public void m1();
}


public class DefaultTestCases implements right,left {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	//in case of default method 
	
	
	
	
	
	interface right2
	{
		default void m1()
		{
			
		}
		
	}


	interface left2
	{
		default void m1()
		{
			
		}
	
	}


	public class DefaultTestCases2 implements right2,left2 {
  
	
		//solution to avoid ambugity problem 
		@Override
		public void m1() {
			// TODO Auto-generated method stub
			left2.super.m1();
		}
	}
	
	
	
}
