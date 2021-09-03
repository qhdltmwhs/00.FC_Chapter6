package ch17.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
/*
 * Externalizable
 * - writerExternal()과 readExternal()메서드를 구현해야 함
 * - 프로그래머가 직접 객체를 읽고 쓰는 코드를 구현 할 수 있음
 */
public class Person implements Externalizable {
	
	private String name;
	private String job;

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		//out.writeUTF(job);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();	
		//job = in.readUTF();
		
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
}
