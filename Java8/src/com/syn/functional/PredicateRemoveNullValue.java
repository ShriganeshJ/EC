package com.syn.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.syn.bean.Employee;

public class PredicateRemoveNullValue {

	static List<Employee> list = Arrays.asList(new Employee("raja", 1000, "d", 0), new Employee("aman", 6000, "d", 0),
			new Employee("amit", 3000, "d", 0), new Employee("alik", 5000, "d", 0), new Employee(null, 8000, "d", 0),
			new Employee("stish", 8000, null, 0),

			new Employee(" ", 8000, "d", 0),

			new Employee("pitish", 6000, "d", 0));

	public static void main(String[] args) {

		Predicate<Employee> p = i -> i.getEmpName() != null & i.getEmpName().length() != 0;

		Predicate<Employee> p2 = i -> i.getDesignation() != null & i.getDesignation().length() != 0;

		list.forEach((i) -> {

			if (p.and(p2).test(i)) {
				System.out.println(i);
			}

		});

	}

}
