package Codeup_41_60;

import java.util.Scanner;

public class Code1042_나눈몫 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//입력문
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// "/"은 나눈 몫
		// "%"은 나누고 나머지값
		int output = num1 / num2;
		
		System.out.println(output);
		sc.close();
	}

}
