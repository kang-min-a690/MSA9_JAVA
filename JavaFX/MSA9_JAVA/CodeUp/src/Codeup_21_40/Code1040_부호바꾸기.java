package Codeup_21_40;

import java.util.Scanner;

public class Code1040_부호바꾸기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력문
		Long input = sc.nextLong();
		
		//부호를 양수로
		long change = -input;
		
		System.out.println(change);
		
		sc.close();
	}

}
