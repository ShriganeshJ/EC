package com.js.thread;

import java.util.List;

import com.js.dao.DaoImpl;

import com.js.dao.ProductTableEntity;

public class Controller {
     
	
	
	ThreadLocal<DaoImpl> tl = new ThreadLocal<DaoImpl>();
	private List<ProductTableEntity> list;
	DaoImpl dao = new DaoImpl();

	public void Controller01(String name, int quantity) throws InterruptedException {

		for (int i = 0; i < 1000; i++) {

			Thread t = new Thread(() -> {
                  tl.set(new DaoImpl());
				tl.get().sellProduct(name, quantity);

			});

			t.setName("Thread Sell " + i);

			t.start();
          
		}

	}

	public List<ProductTableEntity> getTable() {
		return DaoImpl.list;
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
