package Codeup_41_60;

import java.util.Scanner;

public class Code1041_아스키출력하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char input = sc.nextLine().charAt(0);
		
		int output = input + 1;
		
		System.out.printf("%c",output);
		sc.close();
	}

}
