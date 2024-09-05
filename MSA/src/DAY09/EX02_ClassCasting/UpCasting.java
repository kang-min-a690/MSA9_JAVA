package DAY09.EX02_ClassCasting;

public class UpCasting {
	
	public static void main(String[] args) {
		// *업캐스팅 (자동 타입 변환)
		// (부모클래스) = (자식클래스)
		// : 자식객체를 부모클래스타입으로 변환하는것
		Person person = new Student("강민아", 20, 1, "컴퓨터공학과");
		
		
		// Person					:name, age
		// Student					:name, age, grade, major
		System.out.println("name : " + person.name);
		System.out.println("age : " + person.age);
		
		// person 객체에서는 grade,major 변수를 접근할수없다.
		//System.out.println("grade : " + person.grade);
		//System.out.println("major : " + person.major);
		
		//클래스를 업캐스팅 하면,
		// 변수는 부모클래스에 있는 변수만 접근 가능하고
		//메소드는 자식 클ㄹ래스의 메소드가 우선하여 실행된다.
		
		//override : 우선하다,무시하다
		System.out.println(person);
		System.out.println(person.work());
		
		//바인딩 (Binding)
		//: 프로그램에서 사용되는 요소에 실제값을 결정짓는 행위
		
		// - 정적 바인딩 :컴파일 시간에 결정
		// 변수 등
		
		//-동적 바인딩 : 실행 시간에 결정
		//오버라이딩 등
		
		
		
	}

}
