package Codeup_41_60;

import java.util.Scanner;

public class Code1046_합계와평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수 3개 입력문
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//합계
		int sum = num1 + num2 + num3;
		
		//평균 : 실수라 강제 형변환 진행
		double average = (double) sum / 3;
		
		//합계출력
		System.out.println(sum);
		
		//평균출력(소수점 첫째 자리)
		System.out.printf("%.1f" , average);
		
		sc.close();
	}

}
