package CodeReview;

import java.util.Scanner;

/**
 * 양의 정수 M 과 N을 입력받아 저장
 *  M행 N열의 2차원 배열을 생성
 *  각 요소의 값을 입력 받고, 그대로 출력
 *  입력예시**
 *  M : 2
 *  n : 3
 *  1 2 3
 *  4 5 6
 *  출력예시**
 *  1 2 3
 *  1 2 3
 */

public class 배열2차원 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("M : ");
			int M = sc.nextInt();
			System.out.print("N : ");
			int N = sc.nextInt();
			
			
			int arr [][] = new int [M][N];
			//1차원
			//arr[0][0] = 1;
			//arr[0][1] = 2;
			//arr[0][2] = 3;
			//2차원
			//arr[1][0] = 4;
			//arr[1][1] = 5;
			//arr[1][2] = 6;
			
			//입력
			// 2차원 배열은 이중반복문으로 접근한다.
			// 바깥쪽 반복문			- 반복변수 i :행 접근
			// 안쪽 반복문				- 반복변수 j :열 접근
			// arr.lenght			: 행의 개수
			// arr[i].lenght		: 열의 개수
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = sc.nextInt();
				}
		}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print( arr[i][j] + " " );
				}
				System.out.println();
		}
			System.out.println("---------------------------------");
			
			//foreach 으로 2차원 배렬 출력
			for (int[] row : arr) {
				for(int col : row) {
					System.out.print(col + " ");
				}
				System.out.println();
			}

			sc.close();
	}
}

