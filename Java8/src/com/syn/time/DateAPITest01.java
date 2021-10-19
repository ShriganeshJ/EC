package com.syn.time;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAPITest01 {
	
	
	
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println("Date is "+ld);
		
		//get day value
		
		System.out.println("Date is "+ld.getDayOfMonth());
		//get month value
		System.out.println("Month is "+ld.getMonthValue());
		//get year value
		System.out.println("Year is "+ld.getYear());
		
		
		
		
	System.out.println("*************  Time  ************************");	
		
		
		
		LocalTime lt = LocalTime.now();
		System.out.println("Time is "+lt);
		
		//hr
		
		System.out.println("Get Hour "+lt.getHour());
		//min 
		
		System.out.println("Get minute "+lt.getMinute());
		
		//sec
		System.out.println("Get seconds "+lt.getSecond());
		
		//nano sec
		System.out.println("Nano second "+lt.getNano());
		
	}

}
