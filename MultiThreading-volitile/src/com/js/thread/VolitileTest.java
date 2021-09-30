package com.js.thread;

public class VolitileTest {
	
	private int count =0;
	
	public synchronized void countInc()
	{ 	  
		
		for(int i=0;i<60000;i++)
		{
			count++;
		}
		
		
		
		
	}
	
	
	public int getCounter()   
	{  
	return count;  
	}  
	
	
	
	public static void main(String[] args) {
		VolitileTest vt = new VolitileTest();
		
		
		
		Thread th = new Thread(()->{
			
			int oldValue = vt.getCounter();  
			System.out.println("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);  
			
			
			vt.countInc();
			
			
			int newValue = vt.getCounter();  
			System.out.println("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);  
			
			
		});
		Thread th2 = new Thread(()->{
			int oldValue = vt.getCounter();  
			System.out.println("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);  
			
			
			vt.countInc();
			
			
			int newValue = vt.getCounter();  
			System.out.println("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);  
			
			
		});
		
		
		th.start();
		th2.start();
		
		
		
		
		
		
		
		
		
		
	}

}
