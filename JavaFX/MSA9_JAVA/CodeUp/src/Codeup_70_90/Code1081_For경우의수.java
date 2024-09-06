package Codeup_70_90;

import java.util.Scanner;

public class Code1081_For경우의수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		//1번 주사위
		int m = sc.nextInt();		//2번 주사위
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.println(i +" " + j);
			}
			
		}
	}		
}		


