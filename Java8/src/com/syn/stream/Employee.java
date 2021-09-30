package com.syn.stream;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String add;
	private int sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public int getSal() {
		return sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Employee(int id, String name, int age, String add, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.add = add;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", add=" + add + ", sal=" + sal + "]";
	}
	
	
	
}
