package Codeup_10_20;

import java.util.Scanner;

/**
 * 정수 N의 출력
 * N의 정수가 저장되고 N개의 정수를 입력할수있다
 * N개의 정수중 최대값을 찾아 출력한다.
 */
public class Code07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int [N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if( max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		sc.close();
	}
}