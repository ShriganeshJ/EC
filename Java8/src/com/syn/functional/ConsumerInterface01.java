package com.syn.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class movie {
	String movie;
	String production;
	String capital;

	public movie(String m, String p, String c) {

		this.movie = m;
		this.production = p;
		this.capital = c;
		// TODO Auto-generated constructor stub
	}
}

public class ConsumerInterface01 {

	static List<movie> list = Arrays.asList(new movie("DJ", "MS", "452100"), new movie("bolly", "dharma", "45632"),
			new movie("holly", "flmx", "785420"));

	public static void main(String[] args) {

		Consumer<movie> c = i -> {
			System.out.println(i.movie);
			System.out.println(i.production);
			System.out.println(i.capital);
		};

		for (movie m : list) {
			c.accept(m);
		}

	}

}
