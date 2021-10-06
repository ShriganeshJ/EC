package com.syn.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.syn.bean.Student;

public class FunctionInterface01 {

	static List<Student> list = Arrays.asList(new Student("raja", 10), new Student("jignesh", 35),
			new Student("ramesh", 40), new Student("Durga", 60), new Student("ganesh", 50), new Student("Dinesh", 85));

	public static void main(String[] args) {

		Function<Student, Character> fun = i -> {

			int marks = i.getMarks();
			if (marks >= 35 && marks <= 40) {
				return 'C';
			} else if (marks >= 50 && marks <= 60) {
				return 'B';
			} else if (marks >= 60) {
				return 'A';
			}

			return 'D';
		};

		list.forEach(i -> {
			System.out.println(i + " Grade is " + fun.apply(i));

		});

	}

}
