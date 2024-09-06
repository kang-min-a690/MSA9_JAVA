package Day13_14.Ex04_수강생과정등록;
//2번

public class Worker extends Person {

	public Worker(String name) {
		super(name);
	}

	
	//tostring 아무것도 클릭안하고 출력 해서 " + this.getName() + " 작성
	@Override
	public String toString() {
		return "Worker [" + this.getName() + "]";
	}
}  
	


