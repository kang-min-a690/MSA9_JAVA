package Day13_14.Ex04_수강생과정등록;
//3번

public class Student extends Person {

	public Student(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Student [" + this.getName() + "]";
	}
}
	

