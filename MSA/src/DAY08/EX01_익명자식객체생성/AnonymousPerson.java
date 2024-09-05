package DAY08.EX01_익명자식객체생성;

public class AnonymousPerson {
	
	//익명 자식 객체 생성
	//부모클래스 객체명 = new 부모클래스(){익명객체 정의}
	Person person1 = new Person() {

		@Override
		void work() {
			System.out.println(name + "(" + age + ")");
			System.out.println("어나니어머니");
			System.out.println();
		}
		
		
	};
	
Person person2 = new Person() {

	@Override
	void work() {
		System.out.println(name + "(" + age + ")");
		System.out.println("요리를합니다.");
		System.out.println();
	}
	//오버라이딩꺼내기
	};
	
	void method() {
		person1.name ="유지현";
		person1.age = 30;
		person1.work();
		
	}

}
