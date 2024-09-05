package Codeup_41_60;

import java.util.Scanner;

public class Code1048_pow거듭제곱 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//입력문
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//Math.pow : 거듭제곱 계산식
		// 2를 b 거듭제곱한 값
		//int 라고 형변환 시켜주기
		int num =  (int) (a * Math.pow(2, b));
		
		
		// 출력문
		//2*2*2 =8 
		// 소수점 없이 10진수로 표기
		System.out.printf("%d" ,num);
		sc.close();
	}

}
