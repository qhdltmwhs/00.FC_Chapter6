package ch09;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		try (AutoCloseable obj = new AutoCloseObj()) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 부분 입니다.");
		}
	
		/*
		AutoCloseable obj = new AutoCloseObj();
		try (obj) { //	try (obj)를 변수로 넣는건 java 9 부터 제공되는 기능
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 부분 입니다.");
		}		 
		*/
	}

}
