package Codeup_70_90;

import java.util.Scanner;

public class Code1084_빨녹파경우의수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 0;	//총 갯수
		
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < g; j++) {
				for (int k = 0; k < b; k++) {
					sum ++;
					System.out.println(i+" "+j+" "+k);
				}
			}
		}
		System.out.println(sum);
		sc.close();
	}
	
}
