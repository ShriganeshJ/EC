package com.syn.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateAPITest04 {
	
public static void main(String[] args) {
	
	LocalDate tody = LocalDate.now();
	LocalDate birthDate = LocalDate.of(1995,Month.FEBRUARY,12);
			
			
	
	Period p = Period.between(birthDate,tody);
	
	System.out.println("Age Period in Years "+p.getYears());
	System.out.println("Age Period in  Months "+p.getMonths());
	System.out.println("Age Period in Days "+p.getDays());
	
	//consider age limit is 60
	LocalDate deathDay = LocalDate.of(1995+60, 8, 25);
	
	
	Period p1 = Period.between(tody, deathDay);
	System.out.println("Present In Earth "+p1.getYears());
	System.out.println("Present In Earth months "+p1.getMonths());
	System.out.println("Present In Earth Day "+p1.getDays());
	
}

}
