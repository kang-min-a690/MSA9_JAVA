package DAY09.EX07_Review.추상클래스컴푸터만들기;

public abstract class Computer {
	
	// 추상 메소드를 정의하려면 abstract 키워드를 붙여주어야한다.
	//					 클래스도 abstract 붙힌 추상클래스가 도어야 한다.
	
	public abstract void display();
	public abstract void typing();
	
	public void on() {
		System.out.println("전원을 킵니다");
	}
	public void off() {
		System.out.println("전원을 끕니다");
	}
	

}
