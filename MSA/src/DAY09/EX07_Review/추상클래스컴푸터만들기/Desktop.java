package DAY09.EX07_Review.추상클래스컴푸터만들기;

//부모의 클래스의 추상 메소드는 반드시 오버라이딩 해야한다.

public class Desktop extends Computer {

	@Override
	public void display() {
	System.out.println("Desktop - display");

	}

	@Override
	public void typing() {
		System.out.println("Desktop - typing");

	}

}
