package Codeup_10_20;

import java.util.Scanner;

public class Code16_2차원배열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;

		// 배열 선언
		int arr[][] = new int[n][n];

		// 배열 반복
		for (int i = 0; i < n; i++) {
			// 짝수인 행만 반대로뒤집어주기
			if (i % 2 == 0) {

				for (int j = 0; j < n; j++) {
					arr[i][j] = num++;
				}
				
			// 홀수행만 출력하기
			} else {
				for (int j = n - 1; j >= 0; j--) {
					// index는 0부터 시작하니까 -1을 해줘야함
					arr[i][j] = num++;
				}
			}
		}
		// 배열 출력문
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		sc.close();
	}
}
