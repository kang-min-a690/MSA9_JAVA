package DAY03;

import java.util.Scanner;

public class EX01_if문 {
	
	private void mian() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		//입력 받은 값이 홀수인지, 짝수인지 조건문으로 판단하시오.
		//if 조건문
		//if(조건식) {  }
		//홀수 : 1, 3 , 5, 7....
		//짝수 : 2, 4 , 6, 8....
		
		if (num % 2 == 1 ) 
			System.out.println("홀수 입니다.");
		
		
		sc.close();

	}
}
