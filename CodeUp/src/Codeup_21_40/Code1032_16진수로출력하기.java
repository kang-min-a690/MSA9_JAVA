package Codeup_21_40;

import java.util.Scanner;

public class Code1032_16진수로출력하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력문
		int input = sc.nextInt();
		
		//출력문
		//16진수는 %x 입력(소문자)
		//16진수는 %X 입력(대문자)
		System.out.printf("%X" ,  input);
		sc.close();
	}

}
