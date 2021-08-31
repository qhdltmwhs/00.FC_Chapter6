package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException1 {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 발생
		Class c = Class.forName(className); // ClassNotFoundException 발생
		return c;

	}

	public static void main(String[] args) {

		/*
		 * 예외 처리시 각각의 예외를 여러 catch블럭으로 처리
		 * 상위(부모) 예외 클래스 일수록 코딩순서 뒤쪽에 쓴다.  
		 */
		ThrowsException1 test1 = new ThrowsException1();

		try {
			test1.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("endLine");

	}

}
