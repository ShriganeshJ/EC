package com.syn.bean;

public class Employee {

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", sal=" + sal + ", designation=" + designation + ", empId=" + empId
				+ "]";
	}
	
	  @Override public boolean equals(Object obj) { if (this == obj) return true;
	  if (obj == null) return false; if (getClass() != obj.getClass()) return
	  false; Employee other = (Employee) obj; if (designation == null) { if
	  (other.designation != null) return false; } else if
	  (!designation.equals(other.designation)) return false; if (empId !=
	  other.empId) return false; if (empName == null) { if (other.empName != null)
	  return false; } else if (!empName.equals(other.empName)) return false; if
	  (sal != other.sal) return false; return true; }
	 

	private String empName;
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
