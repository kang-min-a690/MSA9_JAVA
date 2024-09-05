/*
 * Shape 클래스 구현 (오버라이딩)
 * 멤버 변수로 가로 높이 길이를 저장할 변수를 선언
 * 생성자 정의
 * getter,setter 메소드
 * toString 메소드 정의
 */


package DAY07.EX01_추상클래스;

//extends @@@ 선언(구현)
public class Triangle extends Shape{
	
	double width,height;
	
	//생성자
	public Triangle() {
		this(0.0,0.0);
	}
	
	public Triangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}



	//추상클래스에서 정의한 Shape 변수 오버라이딩
	@Override
	double area() {
		// 삼각형의 넓이 = (가로) * (세로) / 2
		return width * height / 2;
	}


	@Override
	double round() {
		// 정삼각형 이라고 생각
		// 삼각형의 둘레 = 3 * width
		return 3 * width;
	}
	
	//getter,setter

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
	//toString()
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
	

}
