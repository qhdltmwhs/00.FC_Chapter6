package ch02;

public class AddTest {

	public static void main(String[] args) {

		/*
		 * Lambda expression 람다식
		 * interface를 구현하여 사용하며 
		 * 하나의 interface에 하나의 메서드만 선언 
		 * 중복 선언 방지용 Annotation (@FunctionalInterface)
		 * @FunctionalInterface는 함수형 인터페이스라는 의미 
		 * 내부에 여러 개의 메서드를 선언하면 에러
		 */
		
		//Add addL = (x, y) -> {return x + y;};
		
		Add addL = (x, y) -> x + y;

		System.out.println(addL.add(3, 5));

	}

}
