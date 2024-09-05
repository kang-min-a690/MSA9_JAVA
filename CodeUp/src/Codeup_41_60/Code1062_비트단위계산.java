package Codeup_41_60;

import java.util.Scanner;

public class Code1062_비트단위계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//비트단위로 출력
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//비트단위로 계산한 결과
		int result = a ^ b;
		
		//진수로 출력
		System.out.println(result);
		sc.close();
		
	}
}


