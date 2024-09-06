package DAY04;

import java.util.Scanner;

public class EX03_최소값 {

	public static void main(String[] args) {
		// 첫 번째 줄에 입력할 개수 N을 입력받고,
				// 둘째줄에 N개의 정수를 공백을 두고 입력받으세요.
				// N 개의 정수 중, 최댓값을 구하시오.
				// (입력예시)
				// 5
				// 90 60 70 100 55    -배열에 저장해놓고
				// 출력
				//최솟값 : 55
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if( min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("최솟값 : " + min);
		sc.close();
		
	}
	

	}


