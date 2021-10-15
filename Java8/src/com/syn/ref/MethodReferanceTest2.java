package com.syn.ref;

public class MethodReferanceTest2 {

	public void readData() {
		System.out.println("File reading ");
		System.out.println("ThreadName" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		MethodReferanceTest2 mt = new MethodReferanceTest2();

		Runnable r = mt::readData;

		Thread t = new Thread(r);
		t.setName("ReadFileTrhead");
		t.start();

	}
}
