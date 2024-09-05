package CodeReview;

import java.util.Scanner;

public class EX01_3의배수 {
	
	//main
	//프로그햄 실행시 가장 먼저 ㅈ실행되는 메소드
	public static void main(String[] args) {
		//정수 하나를 입력받아서
		//입력받은 수가 3의 배수인지 아닌지
		//판단하고 그여부를 출력하는 프로그램을 작성
		//* 3의 배수 O : " 3의 배수입니다
		//* 3의 배수 X : " 3의 배수가 아닙니당
		
		
		//1.정수입력
		Scanner sc = new Scanner(System.in);
		int N =  sc.nextInt();
		
		//2. 3의 배수인지 판단
		if( N % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		sc.close();
	}
	

}
