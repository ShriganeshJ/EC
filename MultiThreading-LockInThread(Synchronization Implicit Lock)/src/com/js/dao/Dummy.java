package com.js.dao;

public class Dummy {
	
	public int count =0;
	
	public void count()
	{
		count++;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		Dummy d = new Dummy();
		
		
Thread t1 = new Thread(()->{
			
	
	       for(int i=0;i<1000;i++)
	       {
			d.count();
	       }
			
		});

Thread t2 = new Thread(()->{
	
	
    for(int i=0;i<1000;i++)
    {
		d.count();
    }
		
	});


t1.start();
t2.start();

Thread.sleep(1000);
System.out.println("count value is :: "+d.count);
		
		
	}

}
