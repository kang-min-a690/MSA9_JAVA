package DAY08.EX01_익명자식객체생성;

public class 자기소개테스트 {
	
	public static void main(String[] args) {
		AnonymousPerson ap = new AnonymousPerson();
		ap.method();
		
		//익명자식 객체 생성
		Person person = new Person() {
			String name ="강민아";
			int age = 30;
			
			void work() {
				System.out.println(name + "(" + age + ")");
				System.out.println("연기를 합니다");
			}
		};
		
		person.work();
	}

}
