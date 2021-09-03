package ch17.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {

		/*
		 * 인스턴스 상태를 저장하는 직렬화
		 * 직렬화는 인스턴스의 내용이 외부로 유출되는 것이므로 
		 * 프로그래머가 해당 객체에 대한 직렬화 의도를 표시해야 함
		 */
		Person personLee = new Person("이순신", "대표이사");
		Person personKim = new Person("김유신", "상무이사");

		/*
		 * Serialization
		 */
		try (FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(personLee);
			oos.writeObject(personKim);

		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * deSerialization
		 */
		try (FileInputStream fis = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			Person pLee = (Person) ois.readObject();
			Person pKim = (Person) ois.readObject();

			System.out.println(pLee);
			System.out.println(pKim);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
