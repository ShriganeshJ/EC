package com.syn.db;

import java.util.Arrays;
import java.util.List;

import com.syn.bean.Employee;

public class GetData {

	public static List<Employee> getDetails() {
		List<Employee> list = Arrays.asList(new Employee("Amit", 10000, "d1", 101),
				new Employee("Raj", 10000, "d3", 821), new Employee("Sam", 10000, "d3", 201),
				new Employee("Hob", 10000, "d1", 141), new Employee("Tom", 10000, "d1", 203),
				new Employee("Kapil", 10000, "d2", 129), new Employee("Sachin", 10000, "d2", 201));

		return list;

	}

}
