package com.js.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceMethod {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(10,50,60,78,10,21);
		
		
		list.stream().reduce(Integer::max).get();
		
		
		
		
		
	List<CollectionObjets> listObjects = new ArrayList<CollectionObjets>();
	
	
	
	List<EmployeeBean> ebien = listObjects.stream().map(i->i.getEbeands()).collect(Collectors.toList());
		
		System.out.println(ebien);
		
	}

}
