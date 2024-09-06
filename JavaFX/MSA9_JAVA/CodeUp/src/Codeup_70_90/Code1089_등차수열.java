package Codeup_70_90;

import java.util.Scanner;

public class Code1089_등차수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		//반복문 시작
		
		for (int i = 1; i < n; i++ ) {		// n - 1 까지 반복
			a += d;  // 매 반복마다 +3씩 a 값에 더함
			//1. a = a+d
			//2. a = a+d+d .... 
			//n. a = a+d+d+d+d
			}
			System.out.println(a);
			sc.close();
		}
	}

