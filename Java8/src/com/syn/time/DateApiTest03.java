package com.syn.time;

import java.time.LocalDateTime;
import java.time.Month;

public class DateApiTest03 {

	public static void main(String[] args) {

		// of method with time
		LocalDateTime dt = LocalDateTime.of(1995, Month.JANUARY, 12, 12, 45);
		System.out.println(dt);

		// after six month what is date

		System.out.println("After six months" + dt.plusMonths(3));
		// Before six month
		System.out.println("Before six months" + dt.minusMonths(6));

		// Before day
		System.out.println("after 2 day " + dt.plusDays(2));

		// after day
		System.out.println("before 3 day " + dt.minusDays(3));
		
		//plus week ,hours,mints
		//minus week,hours,mints
	}

}
