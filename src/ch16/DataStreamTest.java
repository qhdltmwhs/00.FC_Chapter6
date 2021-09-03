package ch16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		
		/*
		 * data의 타입을 그대로 읽고 쓰는 보조스트림이다.
		 * data의 읽고 쓰는 타입고 순서가 같아야 한다.
		 */
		try (FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {

			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
			dos.writeUTF("안녕하세요.");

		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("data.txt"); 
				DataInputStream dis = new DataInputStream(fis)) {

			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}