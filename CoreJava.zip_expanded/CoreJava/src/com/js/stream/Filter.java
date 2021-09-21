package com.js.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter {

	public static List<Employee> getEmployee()
	{
		List<Employee> list = Arrays.asList(new Employee(5, "raj", 20, "hyd", 25000),
				new Employee(10, "mahes", 27, "pun", 75000),
				new Employee(6, "statish", 32, "del", 85000),
				new Employee(9, "ravi", 29, "kel", 95000));
		
		
		return list;
		
	}
	
	public static void main(String[] args) {
		
		
		List<Employee> list = getEmployee();
		//get employee sal is grater than 50,000
		List<Employee> listSal = list.stream().filter(i->i.getSal()>50000).collect(Collectors.toList());
		// seprate employee and then sort employee by name
		
		List<String> listSorted = list.stream().map(i->i.getName()).sorted().collect(Collectors.toList());
		//sort without modification 
		List<Employee> listSal02=list.stream().sorted().collect(Collectors.toList());
		
		
		
	}
}
