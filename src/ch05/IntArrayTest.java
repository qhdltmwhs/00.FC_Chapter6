package ch05;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] intArr = { 1, 2, 3, 4, 5 };

		int sumVal = Arrays.stream(intArr).sum();
		//int count = (int) Arrays.stream(intArr).count();
		long count = Arrays.stream(intArr).count();

		System.out.println(sumVal);
		System.out.println(count);

	}

}
