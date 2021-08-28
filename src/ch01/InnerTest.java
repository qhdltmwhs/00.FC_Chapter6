package ch01;

class OutClass {// outerClass

	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	public OutClass() {
		inClass = new InClass();
	}

	public class InClass {// innerClass

		int iNum = 100;
		//static int sInNum = 200;  //에러 남
		
		void inTest() {
			
			System.out.println("--OutClass.InClass.inTest--");
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println("OutClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println();
			
		}
		/*
		static void sTest(){  //에러 남
    	
	    }
	    */	
	}

	static class InStaticClass {// static innerClass

		int iNum = 100;
		static int sInNum = 200;

		void inTest() {// static innerClass 일반 메서드
			
			System.out.println("--OutClass.InStaticClass.inTest--");
			System.out.println("InStaticClass iNum= " + iNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println();
			
		}
		
		static void sTest() {// static innerClass 스태틱 메서드
			
			System.out.println("--OutClass.InStaticClass.sTest--");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println();
			
		}
	}

	public void usingClass() {// outerClass 일반 메서드
		inClass.inTest();
	}

}

public class InnerTest {

	public static void main(String[] args) {

		/*
		 * innerClass 일반적 외부 사용법 
		 * innerClass는 외부에서 생성을 막고자 private제한을둔다.
		 * ( private class InClass {...} )
		 */
		OutClass outClass = new OutClass();
		outClass.usingClass();

		/*
		 * innerClass 비일반적으로 외부 사용법 (문법적으로 가능함) 
		 * outerClass객체의 참조를 사용하여 innerClass를 생성
		 * 이때 innerClass는 public이며 outerClass객체가 존재햐야 한다.
		 */
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();
		
		/*
		 * innerClass가 static이면
		 * outerClass객체 참조없이 직접 innerClass 생성 가능
		 */
		OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
		inStaticClass.inTest();
		
		/*
		 *  innerClass가 static이고 innerClass의 메서드가 static이면 
		 *  outerClass객체 생성없이 직접 메소드 호출 가능
		 */
		OutClass.InStaticClass.sTest();
		
	}

}
