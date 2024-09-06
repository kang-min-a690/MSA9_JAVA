package DAY09.EX07_Review.추상클래스컴푸터만들기;

//추상클래스의 추상메소드를 구현하지않으면 ,
//해당 클래스도 추상클래스로 정의해야한다.
public abstract class Laptop extends Computer{

	@Override
	public void display() {
		System.out.println("Laptop - display");
	}
	
	

}
