package com.syn.time;

import java.time.LocalDateTime;

public class DateApiTest02 {
	
	
	public static void main(String[] args) {
		//Both date and Time
		
		
		
		
		LocalDateTime ldt = LocalDateTime.now();
		
	
		System.out.println("Day of mont "+ldt.getDayOfMonth());
		System.out.println("Month "+ldt.getMonth());
		System.out.println("Year "+ldt.getYear());
		System.out.println("Hour "+ldt.getHour());
		System.out.println("Min "+ldt.getMinute());
		System.out.println("Sec "+ldt.getSecond());
		System.out.println("Nano second "+ldt.getNano());
		
	}

}
