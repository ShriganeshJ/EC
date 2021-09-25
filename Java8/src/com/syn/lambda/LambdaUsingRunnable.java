package com.syn.lambda;

public class LambdaUsingRunnable {

	
	
	public static void main(String[] args) {
		
		
		Thread t = new Thread(()->{
			
			for(int i=0;i<1000;i++)
			{
			System.out.println("Thread-1 "+i);
			}
			
			
		});
		
		Thread t2 = new Thread(()->{
			
			
			for(int i=0;i<1000;i++)
			{
			System.out.println("Thread-2 "+i);
			}
			
		});
		
		
		t.start();
		t2.start();
		
		
		
	}
}
