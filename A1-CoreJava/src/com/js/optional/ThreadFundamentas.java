package com.js.optional;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadFundamentas {
	
	
	
	public void readFiles()
	{
		System.out.println("red file logic "+Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(Thread.currentThread().getName());
		
		ThreadFundamentas tf = new ThreadFundamentas();
		
		Thread t = new Thread(()->tf.readFiles());
		t.setDaemon(false);
		t.setName("raja");
        		
		t.start();
		
		
		
		//executore service
		
		ExecutorService ec = Executors.newFixedThreadPool(5);
		ec.submit(()->tf.readFiles());
		
		
		ec.shutdown();
		
		
		
		
	}

}
