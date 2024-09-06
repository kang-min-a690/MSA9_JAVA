package Codeup_10_20;

import java.util.Scanner;

public class Code18_2차원배열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[][] = new int[n][n]; // 2차원배열선언

		// arr[n]에서 출력된 첫번째 숫자는 arr[i]에 저장
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
		}

		// 숫자채우기
		// 첫행은 끝났으니 두번째 행부터 시작 i,j = 1;
		for (int i = 0; i < n; i++) { // i+1개의 숫자를 반복
			int num = arr[i][0]; // 현재 행의 첫번째 숫자
			for (int j = 1; j <= i; j++) { // 행길이 만큼 반복
				num--; // 숫자를 감소시키며 채우기
				arr[i][j] = num;
			}
		}

		// 배열출력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // 줄바꿈
		}

		sc.close();
	}

}
