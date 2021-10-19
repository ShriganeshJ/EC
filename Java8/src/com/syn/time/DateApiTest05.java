package com.syn.time;

import java.time.Year;
import java.util.Scanner;

public class DateApiTest05 {
public static void main(String[] args) {
	//Year class 
		//calculate leap year
		
		Year year = Year.now();
		System.out.println(year);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year");
		Year y = Year.of(scanner.nextInt());
		
		if(y.isLeap())
		{
			System.out.println("This yeare is leap year");
		}
		else
		{
			System.out.println("This yeare is not leap year");
		}
}
}
