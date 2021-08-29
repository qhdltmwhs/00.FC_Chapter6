 package ch01;

class Outer2 {

	int outNum = 100;
	static int sNum = 200;

	/*
	 * 클래스 메서드
	 */
	Runnable getRunnable(int i) {

		int num = 10;

		return new Runnable () {

			int localNum = 1000;

			@Override
			public void run() {

				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수 사용)");
				System.out.println("sNum = " + sNum + "(외부 클래스 정적 변수 사용)");

			}

		};
		
	}
	
	/*
	 * class 멤버변수
	 */
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 참조변수");
		}
		
	};

}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		
		Outer2 outer = new Outer2();
		
		/*
		 * 클래스 메서드에 익명 클래스 구현
		 */
		Runnable runner = outer.getRunnable(100);
		runner.run();
		
		/*
		 * class 멤버변수에 익명 클래스 구현
		 */
		System.out.println();
		outer.runnable.run(); 
		
	}

}
