package Day02;

import java.util.Scanner;

public class EX10_inputOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
		
		//합계,평균
		int sum = x + y + z;
		double avg = sum / 3;  //자동 형변환
		// (double) = (int) / (int)
		// int 는 정수 자료형으로, 연산을 하면 결과도 int  자료형이됨
		// int 정수 자료형으로는 실수의 소수부분을 표현할수없다.
		
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + avg);
		
		//(큰자료형) + (작은자료형) = (큰자료형)
		//서로다른 자료형을 연산하면, 결과는 큰자료형으로 변환된다.
		
		double realAvg = (double) sum / 3; // sum을 변환하거나, 3을 변환하거나 3을 실수타입 3.0으로 변환하거나해서 소수점 까지 나오게할수있음
		double realAvg2 = sum / 3.0;
		
		System.out.println("실제 평균1 :" + realAvg);
		System.out.println("실제 평균2 :" + realAvg2);
		
	
		sc.close();
		
		
	}

}
