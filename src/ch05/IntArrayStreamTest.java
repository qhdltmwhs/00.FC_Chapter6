package ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntArrayStreamTest {

	public static void main(String[] args) {

		int[] intArr = { 1, 2, 3, 4, 5 };

		Arrays.stream(intArr).forEach(n -> System.out.print(n + "\t"));
		System.out.println();

		int arraySum = Arrays.stream(intArr).sum();
		System.out.println("sum " + arraySum);

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int listSum = list.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println("sum " + listSum);

	}

}
