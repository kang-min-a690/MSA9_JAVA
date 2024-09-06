package Codeup_70_90;

import java.util.Scanner;

public class Code1072_for줄바꿔출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 정수 n개 입력
		
		
		for (int i = 0; i < n; i++) { // 5 4 3 2 1
			//두번재 줄에서 n의 정수를 공백을 기준으로 입력받음
			int num = sc.nextInt(); // 5 4 3 2 1 을 하나씩 입력
			System.out.println(num); //입력받은 정수를 한줄씩 출력
		}
		
		sc.close();
	}

}
