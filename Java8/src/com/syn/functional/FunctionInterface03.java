package com.syn.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.syn.bean.Employee;

public class FunctionInterface03 {
	static List<Employee> list2 = new ArrayList<Employee>();
	static List<Employee> list = Arrays.asList(new Employee("raja", 1000, "d1", 0), new Employee("aman", 6000, "d1", 0),
			new Employee("amit", 3000, "d3", 0), new Employee("alik", 5000, "d2", 0), new Employee(null, 8000, "d2", 0),
			new Employee("stish", 8000, "d3", 0),

			new Employee("ramesh", 8000, "d1", 0),

			new Employee("pitish", 6000, "d3", 0));

	public static void main(String[] args) {

		System.out.println("Befor Increment " + list);
		// predicate for conditon check
		Predicate<Employee> p = i -> i.getSal() < 45000;

		// function for inc salary
		Function<Employee, Employee> fun = e -> {

			e.setSal(e.getSal() + 500);

			return e;
		};

		list.forEach(i -> {

			if (p.test(i)) {

				list2.add(fun.apply(i));

			}

		});

		System.out.println("After Increment " + list2);

	}

}
