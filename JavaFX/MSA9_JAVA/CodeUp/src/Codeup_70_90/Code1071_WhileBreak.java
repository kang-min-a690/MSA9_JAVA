package Codeup_70_90;

import java.util.Scanner;
/*
 * 7 4 2 3 0 1 5 6 9 10 8 반복 출력 후
 * 0 이나오면 종료
 */

public class Code1071_WhileBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) { //무한루프 시작
		int input = sc.nextInt();
		
			if (input == 0 ) { // input이 0이면 종료
				break;
			}
		
			System.out.println(input);
		
		}
		sc.close();
	}
}
		
		



