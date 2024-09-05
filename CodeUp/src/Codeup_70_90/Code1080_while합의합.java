package Codeup_70_90;

import java.util.Scanner;

public class Code1080_while합의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//입력된 정수
		int sum = 0;			//합을 저장할 변수
		int i = 0;				//1부터 시작하는 정수
		
		while (sum < n ) {		// 합이 n보다 작을 때까지 반복
			i++;
			sum += i;			//i를 더해서 sum 을 갱신
		}
		
		System.out.println(i);	// 마지막에 더한 정수 출력
		
	}

}
