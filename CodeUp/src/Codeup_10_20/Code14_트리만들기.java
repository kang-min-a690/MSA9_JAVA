package Codeup_10_20;

import java.util.Scanner;

public class Code14_트리만들기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i += 2) {
			for (int j = 0; j < (n / 2) - i / 2; j++) { // 중앙 기준으로 좌우 대칭을 맞추기위한 계산
				System.out.print(" "); // 중앙 정렬을 위해 왼쪽에 공백출력
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*"); // 별 출력
			}
			System.out.println(); // 줄바꿈
		}
		sc.close();
	}
}
