package Codeup_21_40;

import java.util.Scanner;

public class Code1031_8진수로출력하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//입력문
		int input = sc.nextInt();
		
			
		//출력문
		//%o는 8진수로 변환
		System.out.printf("%o" , input);
		sc.close();
	}

}
