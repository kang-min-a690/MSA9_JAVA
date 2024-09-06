package Day13_14.Ex04_수강생과정등록;
//6번

/**
 * 일반인,학생,직장인 과정을 등록하는 인터페이스
 */

public interface Manager {
	
	//static 이 있으면 s스테틱으로 생각해서 오류
	//Course 오류나면 코스 클래스로 들어가서 <T> 넣어줘야 참조할수있음
	//일반인 과정 생성
	public Course<?> createCourse(String name, Course<Person> course);
	//name: 과정의 이름
	//course : Course<Person> 타입의 객체로, 일반인(Person) 대상의 과정
	//Course<?>는 Person 타입이 아닌 다른 타입일 수 있다는 것을 의미
	
	
	
	// ? super를 넣어줘서 person보다 상위 클래스에게 접근할수 있다.
	// 이름이 같으면 안돼서 바꿔줘야함
	// 직장인 과정 생성 - person,worker
	public Course<?> createWorkerCourse(String name, Course<? super Worker> course);
	//Worker 타입과 그 상위 클래스(Person 포함)의 수강생이 포함된 직장인 과정을 생성
	
	
	
	//학생과정 생성 - 스튜던드, 고등하고,중학교
	public Course<?> createStudentCourse(String name, Course<? extends Student> course);
	// Student 타입 또는 그 하위 클래스(HighStudent, MiddleStudent 등)의
	//수강생이 포함된 학생 과정을 생성하는 역할
	
	
	
	
	
	
	//수강생 목록 출력
	public void printStudentList(Course<?> course);
		
	}
	


