package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {

		int i;
		byte[] bs = new byte[10];

		try (FileInputStream fis = new FileInputStream("input.txt")) {
			while ((i = fis.read(bs, 2, 4)) != -1) { // bs배열에 2칸 띄우고 4칸 채우기!
				for (int j = 0; j < i + 2; j++) {
					System.out.print((char) bs[j]);
				}
				System.out.println(" : " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
