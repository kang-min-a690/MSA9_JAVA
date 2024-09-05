package Codeup_41_60;


import java.util.Scanner;

public class Code1044_정수더해출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력문
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//강제형변환
		double six =(double) num1 / num2 ; 
		
		
		//합
		System.out.println( num1 + num2);
		
		//차
		System.out.println( num1 - num2);
		
		//곱
		System.out.println( num1 * num2);
		
		//몫
		System.out.println( num1 / num2);
		
		//나머지
		System.out.println( num1 % num2);
		
		//나눈 값(소수점 셋째자리에서 반올림해서 둘째자리까지 출력)
		//나머지는 f
		System.out.printf("%.2f", six);
		
	
		sc.close();
	}

}
