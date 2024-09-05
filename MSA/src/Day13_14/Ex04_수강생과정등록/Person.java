package Day13_14.Ex04_수강생과정등록;
//1번


public class Person  {
	
	//최상위 클래스
	
	 private String name;

	 //생성자
	public Person(String name) {
		this.name = name;
	}
	
	//겟 셋
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//투스트링
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	 
	 
	 
	 

	}
	


