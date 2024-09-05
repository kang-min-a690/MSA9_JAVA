package DAY16.Ex04_Serialization;

import java.io.Serializable;

// 직렬화
// Serializable 인터페이스 구현해야 직렬화 객체를 정의할수있다.
public class Person implements Serializable {

	
	// 직렬화 버전 UID
	//private static final long serialVersionUID = 4078828245565289016L;
	
	//역직렬회 버전
	private static final long serialVersionUID = 7327546106407136929L;

	
	private String name;
	private int age;
	
	//변수 추가
	private String address;
	
	//생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
