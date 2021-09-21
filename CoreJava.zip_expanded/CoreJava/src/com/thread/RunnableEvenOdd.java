package com.thread;

import java.util.Arrays;
import java.util.List;

public class RunnableEvenOdd {

	
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		Runnable r = new Thread(()->{
			
			
			
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i)%2==0)
				{
					System.out.println("Even ::"+list.get(i));
				}
			}
			
		});
		
		
Runnable r2 = new Thread(()->{
			
			
			
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i)%2!=0)
				{
					System.out.println("Odd ::"+list.get(i));
				}
			}
			
		});
		
		
		
		r.run();
		r2.run();
		
		
	
		
		
		
		
		
		
	}
}
