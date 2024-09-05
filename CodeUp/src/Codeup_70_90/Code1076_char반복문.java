package Codeup_70_90;

import java.util.Scanner;

public class Code1076_char반복문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char input = sc.nextLine().charAt(0);
		//문자열 코드
		
		//문자 반복 int대신 char = 'a'
		for (char i = 'a'; i <= input ; i++) {
			System.out.print(i + " ");
		}

		sc.close();
	}

}
