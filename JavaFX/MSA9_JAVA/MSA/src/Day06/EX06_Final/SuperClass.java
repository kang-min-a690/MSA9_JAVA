package Day06.EX06_Final;

public class SuperClass {
	//final 메소드
	
	public final void finalWethod() {
		System.out.println("final 메소드 입니다.");
	}
}

class SubClass extends SuperClass {

	
	// 파이널은 오버라이딩 불가
	//@Override
	//public void finalMethod() {
		//System.out.println("final메소드는 오버라이딩 불가");

	}

	
	
