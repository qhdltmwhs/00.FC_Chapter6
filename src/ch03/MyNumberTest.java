package ch03;

public class MyNumberTest {

	public static void main(String[] args) {

		MyNumber numberL = (x, y) -> x > y ? x : y;

		System.out.println(numberL.getMax(10, 20));

	}

}
