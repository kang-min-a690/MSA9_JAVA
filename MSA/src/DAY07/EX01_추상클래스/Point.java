/*
 * 멤버변수로 정수형 변수xy를 선언
 * 기본생성자와 xy를 매개변수로 갖는 생성자를 정의하시오
 * toString() 메소드를 재정의하시오.
 */

package DAY07.EX01_추상클래스;

public class Point {
	
	//멤버 변수
	int x,y;

	
	//alt + shift + s  Generate contructor.. Using Field
	//기본 생성자 (체크안하고)
	public Point() {
		this(0,0);
	}


	//매개변수가 있는 생성자 (체크하고)
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// alt + shift + s -> Generate toString()....
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
