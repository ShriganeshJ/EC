package com.js.java;

public class MissingElementInArray {

	public static int get(int arr[]) {

		int missing = 0;
		int m = arr.length + 1;
		int expectedElement = m * (m + 1) / 2;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

		}

		System.out.println(sum);

		missing = expectedElement - sum;

		return missing;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5,6, 8, 9, 10 };

		System.out.println("Missing element " + MissingElementInArray.get(arr));

	}

}
