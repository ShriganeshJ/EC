package com.syn.functional;

import java.util.function.BiFunction;

import com.syn.bean.EmployeeT;
import com.syn.bean.TimeSheet;

public class BiFunctionalTest2 {

	public static void main(String[] args) {
		
		
		BiFunction<EmployeeT,TimeSheet,Double> f=(e,t)->e.woringH*t.workingDay;
		
		
		System.out.println(f.apply(new EmployeeT("Raja",101, 9),new TimeSheet(101, 40)));
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
