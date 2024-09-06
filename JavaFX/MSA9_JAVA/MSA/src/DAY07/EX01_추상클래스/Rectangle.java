package DAY07.EX01_추상클래스;
 
//추상클래스 상속
public class Rectangle extends Shape {
	
	double width,height;
	
	//생성자
	public Rectangle() {
		this(0.0,0.0);
	}
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	double area() {
		// 사각형 넓이 = 가로 *세로
		return width * height;
	}

	
	@Override
	double round() {
		// 사각형의 둘레 = 2* (width + height)
		return 2 * (width + height);
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

	//toString
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	

}
