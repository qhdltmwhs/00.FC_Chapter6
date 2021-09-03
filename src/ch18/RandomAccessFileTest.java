package ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100); // 4byte
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeDouble(3.14); // 8byte
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeUTF("안녕하세요"); // (한글자당 3byte * 글자수) + String은 마지막에 null 2byte 추가됨
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());

		rf.seek(0);
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());

		int i = rf.readInt();
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		double d = rf.readDouble();
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		String str = rf.readUTF();
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
	}

}
