package com.syn.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.syn.bean.Employee;

//This will work only when we override equals method in employee class

public class PredicateIsEqualStaticMethod {

	static List<Employee> list = Arrays.asList(new Employee("raja", 1000, "d", 0), new Employee("aman", 6000, "d", 0),
			new Employee("amit", 3000, "d", 0), new Employee("alik", 5000, "d", 0), new Employee(null, 8000, "d", 0),
			new Employee("stish", 8000, null, 0),

			new Employee(" ", 8000, "d", 0),

			new Employee("pitish", 6000, "d", 0));

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Employee> p = Predicate.isEqual(new Employee("raja", 1000, "d", 0));

		list.forEach((i) -> {
			if (p.test(i)) {
				System.out.println(i);
			}
		});

		// System.out.println(p.test(new Employee("raja",100,"d", 0)));

	}

}
