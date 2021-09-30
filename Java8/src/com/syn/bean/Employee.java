package com.syn.bean;

public class Employee {
	
	private String empName;
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", sal=" + sal + ", designation=" + designation + ", empId=" + empId
				+ "]";
	}
	private int sal;
	private String designation;
	private long empId;
	public Employee(String empName, int sal, String designation, long empId) {
		
		this.empName = empName;
		this.sal = sal;
		this.designation = designation;
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String disignation) {
		this.designation = disignation;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	

}
