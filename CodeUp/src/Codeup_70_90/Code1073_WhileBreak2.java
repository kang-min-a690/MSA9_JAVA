package Codeup_70_90;
/*
 * 정수가 순서대로 입력된다.
 * 입력된 정수를 줄을 바꿔 하나씩 출력, 0이 입력되면 종료한다.
 * 
 * 입력 : 7 4 2 3 0 1 5 6 9 10 8 
 */

import java.util.Scanner;

public class Code1073_WhileBreak2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int input = sc.nextInt();
			
			if( input == 0) {
				break;
			}
		
			System.out.println(input);
			
		}
		sc.close();
	}

}
