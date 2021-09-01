package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		int i;
		
		try (FileInputStream fis = new FileInputStream("input.txt")) {
			while ((i = fis.read()) != -1) { // 여기서 i는 읽은 바이트의 data
				System.out.print((char) i);
			}
			System.out.println();
		} catch (IOException e) {
			/*
			 * IOException은 FileNotFoundException의 상위타입
			 * IOException만 지정해도 FileNotFoundException이 예외처리 됨
			 */
			e.printStackTrace();
		}
		System.out.println("end");
		
	}

}