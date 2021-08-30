package ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Tomas");
		list.add("Edward");
		list.add("Jack");

		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.print(s + "\t"));
		System.out.println();

		/*
		 * 중간연산 sorted, map, filter
		 * 최종연산 forEach
		 */
		list.stream().sorted().forEach(s -> System.out.print(s + "\t"));
		System.out.println();

		list.stream().map(s -> s.length()).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		list.stream().map(s -> s.length() >= 5).forEach(n -> System.out.print(n + "\t"));
		System.out.println();

		list.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.print(s + "\t"));

	}

}
