package Day06.EX03_02_AccessModifier;

import Day06.EX03_01_AccessModfier.person;

public class mannager {
	
	public static void main(String[] args) {
		student student = new student();
		student.defualtSetting();
		System.out.println("name : " + student.name);
		System.out.println("age : " + student.getAge());
		// 선언한 클래스를 기준으로 접근지정자가 적용된다.
		// 같은 패키지인 manager 클래스에서 student 클래스의 
		// default 접근지정자인 height를 접근할 수 없는 이유?
		//실직적으로 height를 선언한곳은 다른 패키지인 person 클래스이기 때문에 접근불가
		System.out.println("height : " + student.getHeight());
		System.out.println("weight : " + student.getWeight());
		
		person person = new person();
		System.out.println("name : " + person.name);
		System.out.println("age : " + person.getAge());
		System.out.println("height : " + person.getHeight());
		System.out.println("weight : " + person.getWeight());
}

}