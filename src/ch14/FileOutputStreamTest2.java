package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("output.txt")) {

			byte[] bs = new byte[26];
			byte data = 65; //'A' 의 아스키 값

			for (int i = 0; i < bs.length; i++) {
				bs[i] = data++;
			}
			
			fos.write(bs);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * new FileOutputStream("output.txt", true)
		 * 2번째 인자타입은 boolean이고 default값은 false이며, true는 Append의미. 
		 */
		try (FileOutputStream fos = new FileOutputStream("output.txt", true)) {

			byte[] bs = new byte[26];
			byte data = 65;

			for (int i = 0; i < bs.length; i++) {
				bs[i] = data++;
			}

			fos.write('\n');
			fos.write(bs, 2, 10); // 배열의 2 번째 위치부터 10 개 바이트 출력하기

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
