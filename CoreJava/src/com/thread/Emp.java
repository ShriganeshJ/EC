package com.thread;

public class Emp {
	
	
	String name;
	String id;
	String add;
	public Emp(String name, String id, String add) {
		super();
		this.name = name;
		this.id = id;
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}

}
