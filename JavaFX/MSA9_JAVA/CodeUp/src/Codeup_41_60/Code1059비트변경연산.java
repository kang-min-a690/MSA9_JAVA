package Codeup_41_60;

import java.util.Scanner;

public class Code1059비트변경연산 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력문
		int input = sc.nextInt();
		
		
		// "~"연산자는 비트를 바꿔줌
		int bit = ~input;
		

		
		System.out.println(bit);
		
		sc.close();
	}

}
