package com.syn.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {
		
		
		
		
		List<String> str = new ArrayList<String>();
		str.add("raja");
		str.add(null);
		str.add("namit");
		str.add("dinesh");

		Consumer<List<String>> con = i -> {

			for (int k = 0; k < i.size(); k++) {
				System.out.println(i.get(k));
			}

		};
		
		
		
		con.accept(str);
		
		
		
		
		
		
		
		

	}

}
