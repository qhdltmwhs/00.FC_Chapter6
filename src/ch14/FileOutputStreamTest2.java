package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
			
		try (FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write('A');
			fos.write('B');
			fos.write('C');
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
	}

}
