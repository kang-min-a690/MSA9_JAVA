package Day06.EX03_02_AccessModifier;

import Day06.EX03_01_AccessModfier.person;

public class student extends person {  //extends 같은패키지 상속

	//생성자
	public student() {
		super();
	}
	
	public student(String name, int age, int height, int weight) {
		super(name, age, height, weight);
	}

	
	//메소드
	public void defualtSetting() {
		name = "이름없음";			//퍼블릭 접근지정자로, 모든곳에서 접근가능
		age = 20 ;				//protected 접근지정자로, person 상속 받았기땜누에 다름패키지라도 접근가능
		//height= 170;			// default 접근지정자로 같은패키지안에서만 접근가능
		//weight = 60;			//private 접근지정자로, 해당 클래스에서만 접근가능
		
		setHeight(170);
		setWeight(60);
	}
	
}
