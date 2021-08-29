package ch04;

public class StringConcatTest {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";

		/*
		 * 자바 객체 지향 방식 (인터페이스를 직접 구현함)
		 */
		StringConcat concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);

		/*
		 * 람다식을 이용한 방식 (람다식 + 익명객체 사용으로 인터페이스 구현함)
		 */
		StringConcat concat2 = (v1, v2) -> {System.out.println(v1 + "#" + v2);};
		concat2.makeString(s1, s2);

		/*
		 * 익명객체만 사용하여 구현함
		 */
		StringConcat concat3 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "@" + s2);
			}
		};
		concat3.makeString(s1, s2);

	}

}
