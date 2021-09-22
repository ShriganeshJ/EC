package com.js.patterns;

public class BillPughSingletone {
	
	//static inner class create instance
	//it will work multithreading environment
	
	
	private static class HelperClass
	{
         
		private static final BillPughSingletone instance = new BillPughSingletone();
	}
	
	
	
	private static BillPughSingletone getInstance()
	{
		return HelperClass.instance;
	}

	public static void main(String[] args) {
		
		data1();
		data2();
		// TODO Auto-generated method stub

	}
	
	
	
	public static void data1()
	{System.out.println(BillPughSingletone.getInstance().hashCode());
		
	}
	
	public static void data2()
	{
		System.out.println(BillPughSingletone.getInstance().hashCode());
	}

}
