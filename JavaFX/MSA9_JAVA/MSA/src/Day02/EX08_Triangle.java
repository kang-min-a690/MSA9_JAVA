package Day02;

import java.util.Scanner;

public class EX08_Triangle {
	
	public static void main(String[] args) {
		// 삼각형 넓이 : (밑변) x (높이) / 2
		// 밑변과 높이를 입력받아서 삼각형의 넓이를 계산하고 출력하시오
		
		int x = 20;
		int y = 10;
		
		
		System.out.println("삼각형의 넓이는 : " + (x * y)/2 + " 입니다.");
		
		//----------------------------------------------------
		// 1.밑변과 높이를 입력 받는다.
		// 2. 밑변과 높이를 담을 변수를 선언한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 :");
		double width = sc.nextDouble();
		System.out.print("높이 :");
		double height = sc.nextDouble();
		
		
		// 3. 삼각형의 넓이를 계산한다.
		double area = width * height / 2;
		
		// 4. 결과를 출력한다.
		System.out.println("넓이 : " + area);
		
		sc.close();
		
	}

}
