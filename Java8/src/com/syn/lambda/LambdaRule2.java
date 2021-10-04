package com.syn.lambda;

@FunctionalInterface
interface interfs {
	public void m1();

}

//**********************************************
@FunctionalInterface
interface testCase1 extends interfs {

}

//with not  ok 
@FunctionalInterface
interface testCase2 extends interfs {
	public void m2();
}

//**********************************************

//without 
interface testCase3 extends interfs {
	public void m2();
}

//**********************normal and lambda ************************

interface intrf
{
	public void m1();
}


@FunctionalInterface
interface intrctest extends intrf
{
	
}

public class LambdaRule2 {

}
