package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("input.txt");
			/*
			 * 스트림에 read()메서드의 반환값이 int인 이유가 있다.
			 * 반환값이 int이므로 출력시 char형변환하여 출력
			 */
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");

	}

}
