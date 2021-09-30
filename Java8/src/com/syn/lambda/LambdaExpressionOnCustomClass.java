package com.syn.lambda;

import java.util.Collections;
import java.util.List;

import com.syn.bean.Employee;
import com.syn.db.GetData;

public class LambdaExpressionOnCustomClass {
	
	public static void main(String[] args) {
		List<Employee> list = GetData.getDetails();
		
		
		Collections.sort(list,(e1,e2)->e1.getEmpId()>e1.getEmpId()?-11:e1.getEmpId()>e1.getEmpId()?1:0);
		
		System.out.println("List is"+list);
		
		
	}

}
