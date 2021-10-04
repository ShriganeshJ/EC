package com.syn.functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateOnCollenction {

	public static void main(String[] args) {
		Predicate<Collection> colp = p -> p.isEmpty();

		List<String> list = new ArrayList<>();
		System.out.println(colp.test(list));
		list.add("Raja");
		System.out.println(colp.test(list));

	}

}
