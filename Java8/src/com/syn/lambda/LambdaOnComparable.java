package com.syn.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.syn.bean.Employee;
import com.syn.db.GetData;

public class LambdaOnComparable {
	
	
	static List<Integer> list = Arrays.asList(10,20,80,40,21,62,31,5,51);
	
	public static void main(String[] args) {
		
		
		Collections.sort(list,(I1,I2)->(I1>I2)?1:(I1<I2)?-1:0);
		
		
		System.out.println("List"+list);
		
	}

}
