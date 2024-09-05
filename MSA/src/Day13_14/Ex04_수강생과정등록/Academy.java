package Day13_14.Ex04_수강생과정등록;
import java.util.ArrayList;
import java.util.List;
//8번

/**
 * 메인클래스
 */

public class Academy {
	
		public static void main(String[] args) {
			
			//일반인 과정 생성
			List<Person> personList = new ArrayList<Person>();
			personList.add( new Person("민아"));
			personList.add( new Worker("지현"));
			personList.add( new Student("반이"));
			personList.add( new HighStudent("유부"));
			personList.add( new MiddleStudent("초밥"));
			
			Course<Person> personCourse = new Course <>(personList);
			personCourse.createCourse("일반인 과정", personCourse);
			personCourse.printStudentList(personCourse); //전체 수강생 출력
			
			//직장인과정
			List<Worker> workerList = new ArrayList<Worker>();
			workerList.add( new Worker("김백수"));
			workerList.add( new Worker("박조은"));
			workerList.add( new Worker("이조은"));
			Course <? super Worker> workerCourse = new Course <>( workerList);
			Course<?> createWorkerCourse = workerCourse.createWorkerCourse("직장인과정", workerCourse);
			Course<?> createWorkerCourse2 = workerCourse.createWorkerCourse("직장인과정2", workerCourse);
			
			workerCourse.createWorkerCourse("직장인과정", personCourse);
			workerCourse.createWorkerCourse("직장인과정2", personCourse);
			
			workerCourse.printStudentList(workerCourse); //전체 수강생 출력
			
			
			//학생과정
			List<Student> studentList = new ArrayList<Student>();
			studentList.add( new Student("김학생") );
			studentList.add( new HighStudent("김고딩") );
			studentList.add( new MiddleStudent("김중딩") );
			// * list가 학생 클래스이기때문에 일반인,직장인은 들어올수없다. 
			// studentList.add( new Person("일반인") );
			// studentList.add( new Worker("회사원") );
			Course<? extends Student> studentCourse = new Course(studentList);
			studentCourse.createStudentCourse("학생과정", studentCourse);
			//studentCourse.createStudentCourse("직장인과정", workerCourse);
			//studentCourse.createStudentCourse("일반인과정", prsonCourse);
			
			//studentCourse.printStudentList(studentCourse); //전체수강생 출력
			
			List<MiddleStudent> middleStudentsList = new ArrayList<MiddleStudent>();
			middleStudentsList.add( new MiddleStudent("이중딩"));
			Course<MiddleStudent> middleStudentCourse = new Course(middleStudentsList);
			middleStudentCourse.createStudentCourse("중학생 과정", middleStudentCourse);
			//*
			//직장인반이 학생반보다 상위클래스이기때문에 과정세팅을 할수없다.
			//(오류)workerCourse.createWorkerCourse("직장인 과정3", studentCourse);
			
			studentCourse.printStudentList(studentCourse);
			studentCourse.printStudentList(middleStudentCourse);
		
			
		}

}
