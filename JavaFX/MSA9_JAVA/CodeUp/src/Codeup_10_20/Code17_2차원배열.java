package Codeup_10_20;

import java.util.Scanner;

public class Code17_2차원배열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 1;

		// 배열 선언
		int arr[][] = new int[N][N];

		// 배열 반복
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = a++;
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
		sc.close();
	}
}
