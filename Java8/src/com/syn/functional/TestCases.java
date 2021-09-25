package com.syn.functional;

public class TestCases {
Object obj;
}



//invalid '@FunctionalInterface' annotation; inf0 is not a functional interface
@FunctionalInterface
interface inf0
{
}

//invalid '@FunctionalInterface' annotation; inf0 is not a functional interface
@FunctionalInterface
interface inf2
{
	public void m1();
	public void m2();
}

@FunctionalInterface
interface inf
{
	public void m1();
}


@FunctionalInterface
interface inf1
{
	public void m1();
	default void m2() {}
	public static void m3() {}
}

@FunctionalInterface
interface inf12
{
	public void m1();
	default void m2() {}
	public static void m3() {}
	
	//object class methods 
	public int hashCode();
	public boolean equals(Object obj);
	 public String toString();
}

@FunctionalInterface
interface inf123
{
	public void m1();
	default void m2() {}
	public static void m3() {}
	
	//object class methods declaration
	 public String toString() {
	        return getClass().getName() + "@" + Integer.toHexString(hashCode());
	    }
}



