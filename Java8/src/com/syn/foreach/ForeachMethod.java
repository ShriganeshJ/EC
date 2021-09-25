package com.syn.foreach;

import java.util.List;

import com.syn.bean.Employee;
import com.syn.db.GetData;

public class ForeachMethod {

	public static void main(String[] args) {

		List<Employee> list = GetData.getDetails();

		System.out.println("Employee Id| " + "EmployeeName| " + "Employee Sal| " + "EmployeeDesignation");
		list.forEach((i) -> System.out
				.println(i.getEmpId() + " " + i.getEmpName() + " " + i.getDesignation() + " " + i.getSal()));

	}

}
