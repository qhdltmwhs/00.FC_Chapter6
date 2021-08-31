package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 발생
		Class c = Class.forName(className); // ClassNotFoundException 발생
		return c;

	}

	public static void main(String[] args) {

		/*
		 * 예외 처리시 각각의 예외를 하나의 catch블럭으로 처리
		 */
		ThrowsException2 test1 = new ThrowsException2();

		try {
			test1.loadClass("a.txt", "java.lang.Xtring");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("endLine");

	}

}
