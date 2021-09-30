package com.syn.functional;

public class TestCases2 {

}

///*************************************

@FunctionalInterface
interface Parent
{
	public void p();
}
@FunctionalInterface
interface Child extends Parent
{
	
}

///****************||*********************


//*************************************

@FunctionalInterface
interface Parent1
{
	public void p();
}
@FunctionalInterface
interface Child2 extends Parent1
{
	public void p();
}

///****************||*********************



//*************************************

@FunctionalInterface
interface Parent3
{
	public void p();
}
@FunctionalInterface
interface Child3 extends Parent3
{
	public void p();
	public void p2();
}

///***************||**********************






//*************************************

@FunctionalInterface
interface Parent4
{
	public void p();
}
@FunctionalInterface
interface Child4 extends Parent4
{
	
	//public void p1();
}

///***************||**********************


interface Parent5
{
	public void p();
	//public void p2();
}
@FunctionalInterface
interface Child5 extends Parent5
{
	
	//public void p1();
}


