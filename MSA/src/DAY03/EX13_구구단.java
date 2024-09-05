package DAY03;

import java.util.Scanner;

public class EX13_구구단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단");
		int gugu = sc. nextInt();
		// 구구단(1~9단)
		// 원하는 단을 입력받아 아래와 같이, 구구단 수식을 출력하시오
		//입력 : 4단 ~~~~
		
		for (int b = 1; b <= 9; b++){
			int c = gugu * b;
			System.out.println(gugu + "x" + b + "=" + c);
		} 
		
		sc.close();
	}
}



