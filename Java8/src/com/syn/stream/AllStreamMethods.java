package com.syn.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AllStreamMethods {

	public static List<Employee> getEmployee() {
		List<Employee> list = Arrays.asList(new Employee(5, "raj", 20, "hyd", 25000),
				new Employee(10, "mahes", 27, "pun", 75000), new Employee(6, "statish", 32, "del", 85000),
				new Employee(9, "ravi", 29, "kel", 95000));

		return list;

	}

	public static void main(String[] args) {

		List<Employee> list = getEmployee();

		// filter()
		// get employee sal is grater than 50,000
		List<Employee> listSal = list.stream().filter(i -> i.getSal() > 50000).collect(Collectors.toList());
		System.out.println("sal > 50000 ::" + listSal);

		// map() and sort()
		// Separate employee and then sort employee by name
		List<String> listSorted = list.stream().map(i -> i.getName()).sorted().collect(Collectors.toList());
		System.out.println("sorted ::" + listSorted);

		// min() max ()
		int min = list.stream().map(i -> i.getSal()).min((x, y) -> x.compareTo(y)).get();
		int max = list.stream().map(i -> i.getSal()).max((x, y) -> x.compareTo(y)).get();

		System.out.println("Min sal :: " + min);
		System.out.println("Max sal :: " + max);

		// reduce()
		int sum = list.stream().map(i -> i.getSal()).reduce(Integer::sum).get();
		System.out.println("Sum sal" + sum);

	}
}
