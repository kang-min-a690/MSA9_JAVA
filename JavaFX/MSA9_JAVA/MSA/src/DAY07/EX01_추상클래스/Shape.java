//추상클래스
/*
 * 추상 클래스를 정의
 * 멤버변수로 Point 객체를 선언
 * 넓이와 둘레를 구하는 메소드 원형을 정의
 * getter,setter 메소드를 정의
 */

package DAY07.EX01_추상클래스;

//abstract 추상클래스 선언,정의
public abstract class Shape {
	
	Point point; //멤버 변수로 선언
	//멤버변수로 Point 객체를 선언
	
	
	//추상메소드 :  abstract[접근지정자 넣어두뎀] 반환타입 메소드명 ( 매개변수)
	abstract double area();			//넓이
	// sysout xxx
	abstract double round();		//둘레
	// sysout xxx
	//추상메소드는(abstract를 쓰면) sysout이 없어도 됨 
	
	//***출력class에서는 넓이,둘레를 area,round로 접근해야함(부모클래스니까)
	
	
	// getter,setter 메소드를 정의
	// alt +shift + s
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	
	
}
