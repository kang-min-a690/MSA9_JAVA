package Codeup_10_20;

import java.util.Scanner;

public class Code15_2차원배열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;
		
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = a++;
				System.out.print( arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}