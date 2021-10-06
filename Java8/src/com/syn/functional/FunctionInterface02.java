package com.syn.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.syn.bean.Employee;

public class FunctionInterface02 {

	static List<Employee> list = Arrays.asList(new Employee("raja", 1000, "d1", 0), new Employee("aman", 6000, "d1", 0),
			new Employee("amit", 3000, "d3", 0), new Employee("alik", 5000, "d2", 0), new Employee(null, 8000, "d2", 0),
			new Employee("stish", 8000, "d3", 0),

			new Employee("ramesh", 8000, "d1", 0),

			new Employee("pitish", 6000, "d3", 0));

	public static void main(String[] args) {
		// calculate total sal

		Function<List<Employee>, Integer> fun = f -> {

			Integer sal = 0;

			for (Employee e : f) {
				sal = e.getSal() + sal;
			}

			return sal;
		};

		System.out.println("Total Sal is " + fun.apply(list));

	}

}
