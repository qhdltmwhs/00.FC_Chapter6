package ch04;

interface PrintString {

	public void showString(String str);

}

public class LambdaTest {

	public static void main(String[] args) {

		/*
		 * 람다식을 참조변수에 대입
		 */
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("참조변수 Lambda_1");

		/*
		 * 람다식을 메서드에 매개변수로 사용
		 */
		//showMyString(lambdaStr);
		showMyString(s -> System.out.println(s));

		/*
		 * 람다식을 반환값으로 사용
		 */
		PrintString rtnLambda = returnString();
		rtnLambda.showString("반환  값");
		
	}

	public static void showMyString(PrintString p) {
		p.showString("매개변수 Lambda_2");
	}

	private static PrintString returnString() {
		return s -> System.out.println(s + " Lambda_3");
	}

}
