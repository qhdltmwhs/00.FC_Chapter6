package ch17.serialization;

import java.io.Serializable;
/*
 * 직렬화는 인스턴스의 내용이 외부로 유출되는 것이므로 
 * 프로그래머가 해당 객체에 대한 직렬화 의도를 표시해야 함
 * Serializable는 구현코드가 없는 marker interface다
 * 즉, implements Serializable만 하면된다.
 * transient : 직렬화 하지 않으려는 멤버 변수에 사용함(Socket등 직렬화 할 수 없는 객체)
 */
public class Person implements Serializable {
	
	private String name;
	private String job;
	//private transient String job;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
}
