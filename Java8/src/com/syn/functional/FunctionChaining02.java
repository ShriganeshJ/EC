package com.syn.functional;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChaining02 {

	public static void main(String[] args) {

		String user, pwd;
		System.out.println("UserName");
		Scanner scr = new Scanner(System.in);
		user = scr.next();
		System.out.println("Password");
		pwd = scr.next();

		// function

		Function<String, String> fun1 = i -> i.substring(0, 6);
		Function<String, String> fun2 = i -> i.toLowerCase();

		if (fun1.andThen(fun2).apply(user).equals("ganesh") && pwd.equals("admin123")) {

			System.out.println("Valid user");

		} else {
			System.out.println("Invalid user ");
		}

	}

}
