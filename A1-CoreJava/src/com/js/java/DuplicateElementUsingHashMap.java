package com.js.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateElementUsingHashMap {

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();

		String str = "rraajdld";

		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}

		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry);
		}

	}

}
