package Codeup_21_40;

import java.util.Scanner;

public class Code1035_16진수를8진수로 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력문
		String input = sc.nextLine();
		
		//입력된게 16진수라는거 알려주기
		int var = Integer.parseInt(input, 16);
		
		
		//8진수 출력문
		System.out.printf("%o" , var);
		sc.close();
		
	}

}
