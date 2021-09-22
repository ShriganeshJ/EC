package com.js.thread;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import com.js.dao.DaoImpl;

import com.js.dao.ProductTableEntity;

public class Controller {

	private DaoImpl dao = new DaoImpl();
	private List<ProductTableEntity> list;
	
	//lock re-entrent lock is explicit locking
	  ReentrantLock lock=new ReentrantLock();  

	public void Controller01(String name, int quantity) {

		for (int i = 0; i < 1000; i++) {

			Thread t = new Thread(() -> {
                   
				lock.lock();
				dao.sellProduct(name, quantity);
				
				lock.unlock();

			});

			t.setName("Thread Sell " + i);
			t.start();

		}

	}

	public List<ProductTableEntity> getTable() {
		return dao.getProductTable();
	}

	public static void main(String[] args) throws InterruptedException {

		Controller cont = new Controller();

		cont.Controller01("product1999", 1);

		Thread.sleep(1000);

		List<ProductTableEntity> list = cont.getTable();

		System.out.println("Product Id |" + "Product Name |" + "Product quantity |");
		list.forEach((i) -> {

			System.out.println(i.getId() + "|" + i.getName() + "|" + i.getQuantity());
		});

	}

}
