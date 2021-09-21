package com.thread;

import java.util.Arrays;
import java.util.List;

public class RunnableEvenJoin  {

	// Deadlock
	// join

	// t1.join and t2.join in main method
	// t1.join write in even and t2.join in oddd dedlock	
	
	public void even() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				System.out.println("Even ::" + list.get(i));
			}
		}

	}

	public void odd() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 != 0) {
				System.out.println("Odd ::" + list.get(i));
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		RunnableEvenJoin evd = new RunnableEvenJoin();
		
	Thread t = new Thread(()->evd.even());
	Thread t2 = new Thread(()->evd.odd());
	
	t.start();
	t2.start();
	t.join();
	t2.join();
	
		

		

		

	}
}
