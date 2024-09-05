
package DAY07.EX01_추상클래스;

import java.util.Scanner;

public class ShapeMaker {

	// main메소드 정의하시오
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력변수
		double width = 0.0;
		double heigth = 0.0;
		double radius = 0;

		// 입력받은 도형 배열 (3개)
		Shape[] shapeList = new Shape[3];
		int index = 0;

		while (true) {
			if (index == 3)
				break;

			System.out.println("1.삼각형, 2. 사각형, 3. 원형");
			System.out.print(">>");
			String input = sc.next(); // next () : String(문자열)입력

			if (input.equals("그만"))
				break;

			// 도형선택
			switch (input) {
			// 삼각형일때
			case "1": //1번일때~
				System.out.print("가로 : ");
				width = sc.nextDouble();
				System.out.print("세로 : ");
				heigth = sc.nextDouble();
				shapeList[index++] = new Triangle(width, heigth); // 인덱스에 ++하면 도형이 증가할때마다 계산
				// 또는 index++;
				break;
			// 사각형
			case "2": //2번일때~
				System.out.print("가로 : ");
				width = sc.nextDouble();
				System.out.print("세로 : ");
				heigth = sc.nextDouble();
				shapeList[index++] = new Rectangle(width, heigth);// 인덱스에 ++하면 도형이 증가할때마다 계산
				// 또는 index++;
				// 원형
				break;
				
			case "3": //3번일때~
				System.out.print("반지름 : ");
				radius = sc.nextDouble();
				shapeList[index++] = new Circle(radius);
				break;
			} // switch끝

		} // while끝

		// 넓이 총합,둘레 총합
		double areaSum = 0.0;
		double roundSum = 0.0;

		for (Shape shape : shapeList) {
			
			if( shape == null)
				continue;
			//도형을 하나만 입력하고 '그만'이 된다면 null 이뜨는데
			//이런 if문을 넣으면 정상적으로 그만둘수있음
			
			//이게 없으면 '그만' 실행했을때 nullpointexseption나옴 null은 숫자가 아니니까.
			
			// 넓이와 둘레
			double area = shape.area();
			double round = shape.round();

			// 합계
			areaSum += area;
			roundSum += round;

			// instanceof : 인스턴스를 비교(확인)하는 연산
			// 같은 인스턴스면 true, 아니면 false 를 반환
			if (shape instanceof Triangle)
				System.out.println("삼각형");
			if (shape instanceof Rectangle)
				System.out.println("사각형");
			if (shape instanceof Circle)
				System.out.println("원형");

			System.out.println("넓이 : " + area + "\t"); // \t는 탭만큼 공백
			System.out.println("둘레 : " + round + "\t"); // \t는 탭만큼 공백
			System.out.println();
		} // foreach 끝

		System.out.println("넓이 총합 : " + areaSum);
		System.out.println("둘레 총합 : " + roundSum);

		sc.close();
	}// main 끝

}
