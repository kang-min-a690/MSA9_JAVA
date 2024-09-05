package Day13_14.Ex04_수강생과정등록;
//5번

public class MiddleStudent extends Student{

	public MiddleStudent(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "MiddleStudent [" + this.getName()+ "]";
	}
	
	
}
