package com.syn.functional;

import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.syn.bean.Employee;

public class PredicateHandOn {
	
	static List<Employee> list = Arrays.asList(new Employee("raja",1000,"d", 0),
			new Employee("aman",6000,"d", 0),
			new Employee("amit",3000,"d", 0),
			new Employee("alik",5000,"d", 0),
			new Employee("nilish",8000,"d", 0),
			new Employee("pitish",6000,"d", 0));
	
	//start with a and sal >50000
	
public static void main(String[] args) {
	Predicate<Employee> p1 = i->i.getEmpName().startsWith("a");
	Predicate<Employee> p2 = i->i.getSal()>5000;
	
	
	

	list.forEach((i)->{
		
		
		if(p1.and(p2).test(i))
		{
			System.out.println(i);
		}
		
		
		
	});
	
	
	
	
	
}
	
	

}
