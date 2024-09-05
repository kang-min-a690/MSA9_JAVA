package Codeup_10_20;

import java.util.Scanner;

public class Code11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		

		for (int i = 0; i < N; i++) {			//줄개수 만들어라
			for (int j = 0; j < i; j++) {		//빈 공란	i=1 j=0이니까 빈공란 한개생성 ...
				System.out.print(" ");
			}
				for (int k = 0; k < N-i; k++) {		//(N-i을 줄인것보다 작을때 까지 *을 만들어라 
					System.out.print("*");
				}
				System.out.println();				//1번 for문 부터 반복해라
			}
		sc.close();
		}
	}
