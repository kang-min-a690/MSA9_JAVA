package Codeup_21_40;

import java.util.Scanner;

public class Code1037_정수를아스키로 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수입력문
		int input = sc.nextInt();
		
		System.out.printf("%c" , input);
		sc.close();
	}

}
