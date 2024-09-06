package DAY07.EX01_추상클래스;

public class Circle extends Shape {
	
	double radius; // 반지름

	//생성자
	
	public Circle() {
		this(0);
	}
	
	public Circle(double raidus) {
		super();
		this.radius = raidus;
	}



	@Override
	double area() {
		// 원의 넓이 = (원주율) * (반지름) * (반지름)
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	double round() {
		// 원의 둘레 = 2 * (원주율) * (반지름)
		return 2 * Math.PI * radius;
	}

	//getter,setter
	public double getRaidus() {
		return radius;
	}

	public void setRaidus(double radius) {
		this.radius = radius;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}


}
